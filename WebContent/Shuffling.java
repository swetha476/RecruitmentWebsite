public class Main {
static int[] inShuffle(int deck[])
{
int n=deck.length;
int[] shuffled_deck=new int[n];
for(int i=0;i<n/2;i++)
{
shuffled_deck[2*i]=deck[n/2+i];
shuffled_deck[2*i+1]=deck[i];
}
return shuffled_deck;
}
static void print(int deck[])
{
int n=deck.length;
for(int i=0;i<n;i++)
System.out.print(deck[i]+" ");
System.out.println();
}
public static void main(String[] args) {
int deck[];
deck = new int[52];
for(int i=0;i<52;i++)
deck[i]=i+1;
boolean q1=false,q2=false,q3=false;
int shuffles=0;
while(true)
{
if(q1&&q2&&q3)
break;
deck=inShuffle(deck);
shuffles++;
if(shuffles==7)
{
for(int i=0;i<52;i++)
{
if(deck[i]==1)
{
System.out.println("Position of first card after 7th shuffle: "+(i+1));
q1=true;
break;
}
}
}
if(deck[51]==1)
{
System.out.println("Top card becomes bottom card in "+shuffles+" shuffles.");
q2=true;
}
for(int i=0;i<51;i++)
{
if((deck[i]==52&&deck[i+1]==1)||(deck[i]==1&&deck[i+1]==52))
{
System.out.println("First card touches last card in "+shuffles+" shuffles.");
q3=true;
break;
}
}
}
}
}

 