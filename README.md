# Epic Knights: Antique Legacy

A Minecraft addon that adds ancient stuff to Epic Knights Mod. Ported to Minecraft 1.21.1 (Fabric & NeoForge).

## Features

- **Ancient Armor Sets**
- **Historical Helmets**
- **Decorative Items**
- **Cross-Platform** (Works on both Fabric and NeoForge)

## Development Environment Setup

This project uses a multi-platform architecture with shared common code and platform-specific implementations.

### Prerequisites

- **Java Development Kit (JDK) 21** or higher

### Project Structure
```
Epic-Knights-Antique-Legacy/
├── common/          # Shared code for all platforms
├── fabric/          # Fabric-specific implementation  
├── neoforge/        # NeoForge-specific implementation
├── gradle/          # Gradle wrapper files
├── build.gradle     # Root build configuration
└── settings.gradle  # Multi-project settings
```

## For VS Code users

### 1. Install Required Extensions

Open VS Code and install these extensions:

```bash
# Essential Java extensions
- Extension Pack for Java (Microsoft)
- Gradle for Java (Microsoft)  
- IntelliCode (Microsoft)

# Optional but recommended
- GitLens — Git supercharged
- Minecraft Development Kit
- YAML (Red Hat)
```

### 2. Configure Java SDK

After Cloning:

1. Press `Ctrl+Shift+P` and search for "Java: Workspace Settings"
2. Set the Java runtime to JDK 21 or higher
3. Configure VS Code settings:
   ```bash
   # Copy the example settings file and customize it
   cp .vscode/settings.json.example .vscode/settings.json
   ```
   
   Then edit `.vscode/settings.json` to point to your Java installation path.

### 3. Build and Run

```bash
# Build the project
./gradlew build

# Run Fabric development client
./gradlew :fabric:runClient

# Run NeoForge development client  
./gradlew :neoforge:runClient
```

## IntelliJ IDEA Setup

### 1. Configure Project SDK

After cloning or importing

1. Go to **File → Project Structure** (`Ctrl+Alt+Shift+S`)
2. Under **Project Settings → Project**:
   - Set **Project SDK** to Java 21 or higher
   - Set **Project language level** to 21
3. Under **Platform Settings → SDKs**:
   - Ensure JDK 21+ is configured

### 2. Generate IDE Files

**Usually, these steps are automatically done by IntelliJ**

Run these Gradle tasks to set up run configurations:

```bash
# Generate IntelliJ workspace files
./gradlew genIdeaWorkspace

# Generate Eclipse run configurations (if needed)  
./gradlew genEclipseRuns
```

### 4. Configure Run Configurations

IntelliJ should automatically create run configurations for:
- **Fabric Client**: Runs the mod in Fabric development environment
- **NeoForge Client**: Runs the mod in NeoForge development environment
- **Fabric Server**: Runs a Fabric development server
- **NeoForge Server**: Runs a NeoForge development server

If they don't appear, run `./gradlew genIdeaWorkspace` again.

### (OPTIONAL) Import Code Style

1. Go to **File → Settings → Editor → Code Style → Java**
2. Import the project's code style (if available) or configure:
   - **Indent**: 4 spaces (not tabs)
   - **Continuation indent**: 8 spaces
   - **Keep indents on empty lines**: Disabled

##  Building and Testing

### Useful Build Commands

```bash
# Clean build (removes previous build artifacts)
./gradlew clean build

# Build specific platform
./gradlew :fabric:build
./gradlew :neoforge:build  

# Build only common code
./gradlew :common:build
```

### Running the Mod

```bash
# Fabric development client
./gradlew :fabric:runClient

# NeoForge development client
./gradlew :neoforge:runClient

# Run with debugging enabled
./gradlew :neoforge:runClient --debug-jvm
```

### Testing

```bash
# Run all tests
./gradlew test

# Run tests for specific platform
./gradlew :fabric:test
./gradlew :neoforge:test
```

## Important Files & Directories

### Assets
- `common/src/main/resources/assets/antiquelegacy/textures/` - Item and armor textures
- `common/src/main/resources/assets/antiquelegacy/models/` - Item and block models
- `common/src/main/resources/data/antiquelegacy/` - Recipes and loot tables

##  Troubleshooting

### Common Issues

**"Cannot resolve symbol" errors:**
- Run `./gradlew clean build` to refresh dependencies
- Restart your IDE and reimport the Gradle project
- Check that your JDK version is 21 or higher

**Run configurations not appearing:**
- Run `./gradlew genIdeaWorkspace` (IntelliJ) 
- Check that Gradle imported successfully
- Verify the project SDK is set correctly

**Build failures:**
- Ensure you're using JDK 21+
- Check for syntax errors in recent changes
- Run `./gradlew clean` and try building again

**Texture/model not showing in game:**
- Check file paths match the code references
- Verify JSON syntax in model files
- Check for typos in resource locations

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Credits

- **Magistu** - Original Epic Knights creator
- **minucius**
- **simonvargasz** - Ported to 1.21.1