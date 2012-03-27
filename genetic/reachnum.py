import sys
import random

MUTATION_RATE = 0.001
CROSSOVER_RATE = 0.7
CHARSET = "0123456789+-*/"

def mutate(strBits):
    newStrBits = ""
    for c in strBits:
        randNo = random.random()
        if randNo <= MUTATION_RATE:
            if c == "0":
                newStrBit.append("1")
            if c == "1":
                newStrBit.append("0")
        else:
            newStrBit.append(c)

    return newStrBit

    
def crossOver(strBit1, strBit2):
    randNo = random.random()
    newStrBit = ""
    if randNo <= CROSSOVER_RATE:
        indexToCross = int(random.uniform(0, len(strBit1)))
        newStrBit = strBit1[:indexToCross] + strBit2[indexToCross:]
    else newStrBit = strBit1
    return newStrBit
    
def decode(strBits):
    lastFourth = len(strBits) // 4
    indexInCharset = 0
    strExprsn = ""
    for i in range(lastFourth):
        indexInCharSet = int(strBits[4i]) * 8 + int(strBits[4i+1]) * 4 + int(strBits[4i+2]) * 2 + int(strBits[4i+3])
        if indexInCharSet in range(len(CHARSET)):
            strExprsn.append(CHARSET[indexInCharSet])
    return strExprsn

def evaluate(strExprsn):
    
    
def fitness(valOfExprsn, goal):
    return 1 / abs(valOfExprsn - goal)
    
def isSolution(valOfExprsn, goal):
    return valOfExprsn == goal
    
def checkIfBinary(inputString):
    return all(char in ("0", "1") for char in inputString)
    
def main():
    goal = sys.argv[1]
    starter = sys.argv[2]
    
    

    
main()