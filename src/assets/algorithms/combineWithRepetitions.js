export default function combineWithRepetitions(comboOptions, comboLength) {
    if (comboLength === 1) return comboOptions.map(comboOption => [comboOption]);

    const combos = [];

    comboOptions.forEach((currentOption, optionIndex) => {
        const smallerCombos = combineWithRepetitions(
            comboOptions.slice(optionIndex),
            comboLength - 1,
        );

        smallerCombos.forEach((smallerCombo) => {
            combos.push([currentOption].concat(smallerCombo));
        });
    });

    return combos;
}
