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
	
	private static final int numberOfRounds = 24;
	private static final int permutationSize = 1600; // as specified by NIST for permutation function.
	
	private int capacity;
	private int rate;
	
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
	
	public void init(int lenInBit){
		
	}
}
