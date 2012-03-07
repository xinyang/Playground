#include <stdio.h>
#include <stdlib.h>
#include <assert.h>
#include <string.h>

void swap(char* a, char* b)
{
  char cTemp;
  assert(a != NULL);
  assert(b != NULL);
  cTemp = *a;
  *a = *b;
  *b = cTemp;
}

char* reverse(char* pc)
{
  char* pcCopy;
  char* pcTemp;
  char* pcCopyStart;
  assert(pc != NULL);
  
  pcCopy = (char*)malloc((strlen(pc) + 1) *sizeof(char));
  strcpy(pcCopy, pc);
  pcCopyStart = pcCopy;
  pcTemp = pcCopy;
  while(*pcCopy++); pcCopy-=2;
  while(pcTemp < pcCopy) 
    {
      swap(pcTemp, pcCopy);
      pcTemp++; pcCopy--;
    }
  return pcCopyStart;
}


int main(void)
{
  char* pcString = "whyhellothere!";
  char* pcReversed;
  char a;
  char b;
  a = 'a';
  b = 'b';
  printf("a is %c, b is %c, &a is %p, &b is %p\n", a, b, &a, &b);

  swap(&a, &b);
  printf("after swap, a is %c, b is %c, &a is %p, &b is %p\n", a, b, &a, &b);
  pcReversed = reverse(pcString);
  printf("%s\n", pcReversed);
  free(pcReversed);
  return 0;
}
