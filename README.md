# Shoploc Config Server

## Overview

`shoploc-config-server` is a centralized configuration service for the
Shoploc microservices platform.

It provides externalized configuration to Shoploc microservices,
allowing application configuration to be managed independently from
application code.

The Config Server is part of the Shoploc microservices infrastructure.

## Responsibilities

The Config Server is responsible for:

- Providing centralized configuration to Shoploc microservices
- Externalizing application configuration
- Managing environment-specific configuration
- Providing configuration based on application name and profile
- Avoiding duplicated configuration across microservice repositories
- Providing a consistent configuration mechanism across environments

The Config Server does **not** contain business logic.

## Architecture

```text
                         Shoploc Services
                               │
              ┌────────────────┼────────────────┐
              │                │                │
              ▼                ▼                ▼
        Identity Service   Catalog Service   Order Service
              │                │                │
              └────────────────┼────────────────┘
                               │
                               ▼
                    ┌──────────────────────┐
                    │   Config Server      │
                    │                      │
                    │ shoploc-config-      │
                    │ server               │
                    └──────────┬───────────┘
                               │
                               ▼
                    Configuration Repository