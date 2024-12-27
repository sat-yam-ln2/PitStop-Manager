package com.pitstopmanager.util;

import java.util.List;
import java.util.regex.Pattern;

public class ValidationUtil {

    // Regular expression patterns
    private static final Pattern NAME_PATTERN = Pattern.compile("^[a-zA-Z\\s]+$");
    private static final Pattern TEAM_PATTERN = Pattern.compile("^[a-zA-Z0-9\\s]+$");

    // Constraints
    private static final double MIN_TRANSFER_FEE = 0.5; // Example minimum transfer fee in millions
    private static final double MAX_TRANSFER_FEE = 200.0; // Example maximum transfer fee in millions
    private static final int MIN_CONTRACT_DURATION = 1; // Minimum contract duration in years
    private static final int MAX_CONTRACT_DURATION = 10; // Maximum contract duration in years

    /**
     * Validates if a string is null or empty.
     *
     * @param value the string to validate
     * @return true if the string is null or empty, otherwise false
     */
    public static boolean isNullOrEmpty(String value) {
        return value == null || value.trim().isEmpty();
    }

    /**
     * Validates if the name contains only alphabets and spaces.
     *
     * @param name the name to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidName(String name) {
        return !isNullOrEmpty(name) && NAME_PATTERN.matcher(name).matches();
    }

    /**
     * Validates if the team name contains only alphabetic characters and spaces,
     * and exists in the list of existing teams.
     *
     * @param team the team name to validate
     * @param existingTeams a list of existing team names (required)
     * @return true if valid, otherwise false
     */
    public static boolean isValidTeam(String team, List<String> existingTeams) {
        if (isNullOrEmpty(team) || !team.matches("^[a-zA-Z ]+$")) {
            return false;
        }
        // Check if existingTeams is null or doesn't contain the team
        if (existingTeams == null || !existingTeams.contains(team)) {
            return false;
        }
        return true;
    }

    /**
     * Validates if the ID is positive.
     *
     * @param id the ID to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidId(int id) {
        return id > 0;
    }

    /**
     * Validates if the age is within a reasonable range (e.g., 18 to 70).
     *
     * @param age the age to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidAge(int age) {
        return age >= 18 && age <= 70;
    }

    /**
     * Validates if the experience in years is non-negative.
     *
     * @param experience the experience in years to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidExperience(int experience) {
        return experience >= 0;
    }

    /**
     * Validates if the number of wins is non-negative.
     *
     * @param wins the number of wins to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidWins(int wins) {
        return wins >= 0;
    }

    /**
     * Validates if the contract duration is within a valid range.
     *
     * @param duration the contract duration in years to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidContractDuration(int duration) {
        return duration >= MIN_CONTRACT_DURATION && duration <= MAX_CONTRACT_DURATION;
    }

    /**
     * Validates if the transfer fee is within expected limits.
     *
     * @param transferFee the transfer fee to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidTransferFee(double transferFee) {
        return transferFee >= MIN_TRANSFER_FEE && transferFee <= MAX_TRANSFER_FEE;
    }

}
