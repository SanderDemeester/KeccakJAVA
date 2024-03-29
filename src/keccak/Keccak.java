package keccak;

// Specification: http://keccak.noekeon.org/Keccak-specifications.pdf
// Implementation by: Sander Demeester
// Keccak designers:
// Guido Bertoni1, Joan Daemen1, Michaël Peeters2 and Gilles Van Assche1
public class Keccak {

	private static final long[] roundConstant = {
		0x0000000000000001L, 0x0000000000008082L, 0x800000000000808AL, 0x8000000080008000L,
		0x000000000000808BL, 0x0000000080000001L, 0x8000000080008081L, 0x8000000000008009L,
		0x000000000000008AL, 0x0000000000000088L, 0x0000000080008009L, 0x000000008000000AL,
		0x000000008000808BL, 0x800000000000008BL, 0x8000000000008089L, 0x8000000000008003L,
		0x8000000000008002L, 0x8000000000000080L, 0x000000000000800AL, 0x800000008000000AL,
		0x8000000080008081L, 0x8000000000008080L, 0x0000000080000001L, 0x8000000080008008L,
	};
	
	// start from (0,0) and run to (4,4) seq
	private static final int[] rotatinOffset = {0, 1, 62, 28, 27, 36, 44, 6, 55, 20, 3, 10, 43, 25, 39, 41, 45, 15, 21, 8, 18, 2, 61, 56, 14};
	private byte[] state = new byte[permutationSize/8];
	private byte[] dataQueue = new byte[maxRate];
	
	private static final int numberOfRounds = 24;
	private static final int permutationSize = 1600; // as specified by NIST for permutation function.
	private static final int maxRate = 1152; // 1600 - 448
	
	private int capacity;
	private int rate;
	private int lenInBit;
	private int queueSize;
	
	// A round consists of 5 different fases, eg: theta, rho, pi, chi and iota
	
	private void theta(){
		
	}
	
	private void rho(){
		
	}
	
	private void pi(){
		
	}
	
	private void chi(){
		
	}
	
	private void iota(int round){ // to index RC[i_r]
		
	}
	
	private void padding(){
		
	}
	
	public void init(int lenInBit){

		// capacity value
		// for giving capacity "c", the claim is that the security would be 2^{c/2}
		if(lenInBit == 0){
			capacity = 576;
		}else if(lenInBit == 244){
			capacity = 448;
		}else if(lenInBit == 384){
			capacity = 767;
		}else if(lenInBit == 512){
			capacity = 1024;
		}else{
			return;
		}
		
		rate = permutationSize - capacity;
		this.lenInBit = lenInBit;
		
		for(int i = 0; i < state.length; i++)     state[i]     = 0;
		for(int i = 0; i < dataQueue.length; i++) dataQueue[i] = 0;
	}
	
	public byte[] gethash(byte[] input){
		// Step1: Initialization and padding
		padding();
		
		return null;
	}
}
