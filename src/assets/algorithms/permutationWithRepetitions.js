export default function permutateWithRepetitions(permutationOptions, permutationLength = permutationOptions.length) {
    if (permutationLength === 1) return permutationOptions.map(x => [x]);

    const permutations = [];
    const smallerPermutations = permutateWithRepetitions(permutationOptions, permutationLength - 1,);

    permutationOptions.forEach((currentOption) => {
        smallerPermutations.forEach(smallerPermutation => {
            permutations.push([currentOption].concat(smallerPermutation));
        });
    })
}