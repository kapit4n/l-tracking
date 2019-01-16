export default function permutateWithoutRepetitions(permutationOptions) {
    if (permutationOptions.length === 1) {
        return [permutationOptions];
    }
    const permutations = [];
    const smallerPermutations = permutateWithoutRepetitions(permutationOptions.slice(1));
    const firstOption = permutationOptions[0];
    
}