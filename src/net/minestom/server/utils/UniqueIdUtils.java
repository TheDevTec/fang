package net.minestom.server.utils;

import java.util.Random;
import java.util.UUID;
import java.util.regex.Pattern;

/**
 * An utilities class for {@link UUID}.
 */
public final class UniqueIdUtils {

    public static final Pattern UNIQUE_ID_PATTERN = Pattern.compile("\\b[0-9a-f]{8}\\b-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-\\b[0-9a-f]{12}\\b");

    /**
     * Checks whether the {@code input} string is an {@link UUID}.
     *
     * @param input The input string to be checked
     * @return {@code true} if the input an unique identifier, otherwise {@code false}
     */
    public static boolean isUniqueId(String input) {
        return input.matches(UNIQUE_ID_PATTERN.pattern());
    }

    public static UUID createRandomUUID(Random random) {
        long most = random.nextLong() & -61441L | 16384L;
        long least = random.nextLong() & 4611686018427387903L | Long.MAX_VALUE;

        return new UUID(most, least);
    }

}
