# RAG

## Introduction

This is tutorial notes about what the RAG (Retrieval Augmented Generation) is.

https://www.youtube.com/watch?v=u47GtXwePms&t=9s

Retrieval Augmented Generation (RAG) combines retrieval from an external knowledge base with a large language model (LLM) for generation. In this setup, the **retriever** acts as a dynamic prompt provider by fetching relevant information, and the **generator** (LLM) uses that enriched prompt to produce the final output.

### How It Works

1. **External Database Preparation:**
   - **Chunking:** Large documents are divided into smaller, meaningful pieces (chunks).
   - **Vectorization:** Each chunk is converted into a high-dimensional vector (using embeddings) that captures its semantic meaning.
   - **Storage:** These vectors and their corresponding chunks are stored in a vector database for efficient similarity search.

2. **Retrieval Process:**
   - **Query Embedding:** When a user poses a query, it is also converted into a vector using the same embedding method.
   - **Similarity Search:** The vector database is searched to find the chunks (and thus, the information) that are most semantically similar to the query.
   - **Prompt Augmentation:** The retrieved chunks serve as context, effectively acting as an enriched prompt for the generator.

3. **Generation:**
   - The LLM receives both the original query and the additional context from the retriever.
   - The model then produces a final response that is informed by both the query and the relevant external information.

### Diagram

Below is a diagram (using Mermaid syntax) to illustrate the process:

```mermaid
flowchart TD
    A[User Query]
    B[Query Embedding]
    C[Vector Database<br/>(Chunks & Vectors)]
    D[Similarity Search/Retriever]
    E[Retrieved Chunks (Context)]
    F[LLM (Generator)]
    G[Final Answer]

    A --> B
    B --> C
    C --> D
    D --> E
    A --> F
    E --> F
    F --> G
```

### Summary

- **Retriever as Prompt Provider:** The retriever extracts and provides context (from an external database of text chunks and vectors) that augments the original query.
- **LLM as Generator:** The LLM uses the enriched prompt (original query plus retrieved context) to generate more accurate and factually grounded responses.

This combination helps mitigate hallucinations in language models and ensures that generated content is closely tied to verified external data.