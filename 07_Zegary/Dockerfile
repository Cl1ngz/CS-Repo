# =========================
# 1) Etap kompilacji
# =========================
FROM openjdk:17-jdk-slim AS build
WORKDIR /app

# Skopiuj cały projekt
COPY . .

# Znajdź wszystkie źródła, skompiluj i zapakuj do JAR-a
RUN mkdir classes \
 && find . -type f -name "*.java" > sources.txt \
 && javac -d classes @sources.txt \
 && jar cfe app.jar Main -C classes .

# =========================
# 2) Etap uruchomienia
# =========================
FROM openjdk:17-slim
WORKDIR /app

# Skopiuj tylko gotowy JAR
COPY --from=build /app/app.jar .

# Domyślny entrypoint
ENTRYPOINT ["java", "-jar", "app.jar"]
