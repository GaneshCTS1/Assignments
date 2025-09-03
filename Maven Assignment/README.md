# Maven Assignment

This folder contains Maven-based Java projects demonstrating various Maven concepts and site generation.

## Projects

### GaneshParent
- **Type**: Maven Multi-module Parent Project
- **Description**: Parent POM that manages child modules and provides common configuration
- **Location**: `GaneshParent/`

### GaneshChild
- **Type**: Maven Child Module
- **Description**: Child module that inherits configuration from the parent project
- **Location**: `GaneshChild/`

## Maven Site Generation

This assignment demonstrates how to use Maven's site plugin to generate project documentation and reports.

### Scripts Available

- **siteCommands.ps1**: PowerShell script for Windows users
  - Generates Maven sites for both parent and child projects
  - Includes commands to skip unit tests during site generation

### Commands

1. **Generate site for all modules**:
   ```bash
   mvn site
   ```

2. **Generate site skipping unit tests**:
   ```bash
   mvn -DskipTests site
   ```

3. **Generate site with staging for multi-module projects**:
   ```bash
   mvn clean site site:stage
   ```

## Generated Sites

After running the Maven site commands, you can find the generated sites at:

- **Parent Project**: `GaneshParent/target/staging/index.html` (includes all modules)
- **Child Project**: `GaneshChild/target/site/index.html`

## Project Structure

```
Maven Assignment/
├── GaneshParent/           # Parent Maven project
│   ├── pom.xml            # Parent POM configuration
│   ├── src/               # Source directory
│   └── target/            # Build output (generated)
├── GaneshChild/           # Child Maven project
│   ├── pom.xml            # Child POM configuration
│   ├── src/               # Source directory
│   └── target/            # Build output (generated)
├── siteCommands.ps1       # PowerShell script for site generation
└── README.md              # This file
```

## How to Run

1. Navigate to the Maven Assignment directory
2. Run the PowerShell script:
   ```powershell
   .\siteCommands.ps1
   ```
3. Or run Maven commands directly:
   ```bash
   cd GaneshParent
   mvn clean site site:stage
   ```

## Requirements

- Java Development Kit (JDK) 8 or higher
- Apache Maven 3.6 or higher
- PowerShell (for Windows scripts)

## Notes

- The parent project site includes aggregated information from all child modules
- Site generation may take some time depending on project size and available plugins
- Generated sites include project information, dependencies, plugins, and reports
