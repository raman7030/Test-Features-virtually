.class public Lorg/simpleframework/xml/convert/ScannerBuilder$Entry;
.super Lorg/simpleframework/xml/util/ConcurrentCache;
.source "ScannerBuilder.java"

# interfaces
.implements Lorg/simpleframework/xml/convert/Scanner;


# instance fields
.field public final root:Ljava/lang/Class;


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 0

    .line 92
    invoke-direct {p0}, Lorg/simpleframework/xml/util/ConcurrentCache;-><init>()V

    .line 93
    iput-object p1, p0, Lorg/simpleframework/xml/convert/ScannerBuilder$Entry;->root:Ljava/lang/Class;

    return-void
.end method

.method private find(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
    .locals 2

    .line 128
    iget-object v0, p0, Lorg/simpleframework/xml/convert/ScannerBuilder$Entry;->root:Ljava/lang/Class;

    :goto_0
    if-eqz v0, :cond_1

    .line 131
    invoke-virtual {v0, p1}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v1

    if-eqz v1, :cond_0

    return-object v1

    .line 136
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method


# virtual methods
.method public scan(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
    .locals 1

    .line 107
    invoke-virtual {p0, p1}, Lorg/simpleframework/xml/util/ConcurrentCache;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 108
    invoke-direct {p0, p1}, Lorg/simpleframework/xml/convert/ScannerBuilder$Entry;->find(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    if-eqz p1, :cond_0

    if-eqz v0, :cond_0

    .line 111
    invoke-virtual {p0, p1, v0}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    :cond_0
    invoke-virtual {p0, p1}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/annotation/Annotation;

    return-object p1
.end method
