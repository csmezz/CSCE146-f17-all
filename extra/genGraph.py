# Generate a random Graph for CSCE146

import random as rand

def main():
  print("Creating Graph...")
  print("# Vertecies")
  vert = int(input())
  print("Max # Edges")
  maxConn = int(input())
  includeSelf = False
  graph = genGraph(vert, maxConn, includeSelf)
  printGraph(graph)
  printRelations(graph)
  
# Generates a Graph:
#   Number of Verticies, Maximum Number of Connections, Allow Self References
def genGraph(vert, maxConn, self):
  toReturn = []
  
  for i in range(0, vert):
    temp = []
    for j in range(0, vert):
      temp.append(False)
    toReturn.append(temp)
  
  for i in range(0, vert):
    conn = rand.randint(1, maxConn)
    #print(conn)
    for j in range(0, conn):
      num = rand.randint(0, vert - 1)
      if (self == False) and (i == num):
        continue
      #print(num)
      toReturn[i][num] = True
  return toReturn
  
# Pring the Adjacency Matrix of the Graph
def printGraph(graph):
  temp = ""
  for i in graph:
    temp = "{"
    for j in i:
      temp += str(int(j)) + " "
    print(temp + "}")

def printRelations(graph):
  for i in range(0, len(graph)):
    print("\nNode " + str(i) + ": ", end = '')
    for j in range(0, len(graph[i])):
      if (graph[i][j] == True):
        print(str(j) + " ", end = '')
main()