.class public Ll/ܺ۠ᩴ;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ll/ᩳ۠ᩴ;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public postVisitDirectory(Ljava/lang/Object;Ljava/io/IOException;)Ll/ܽ۠ᩴ;
    .locals 0

    .line 107
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    if-nez p2, :cond_0

    .line 110
    sget-object p1, Ll/ܽ۠ᩴ;->CONTINUE:Ll/ܽ۠ᩴ;

    return-object p1

    .line 109
    :cond_0
    throw p2
.end method

.method public preVisitDirectory(Ljava/lang/Object;Ll/ܶ۠ᩴ;)Ll/ܽ۠ᩴ;
    .locals 0

    .line 60
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    invoke-static {p2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    sget-object p1, Ll/ܽ۠ᩴ;->CONTINUE:Ll/ܽ۠ᩴ;

    return-object p1
.end method

.method public visitFile(Ljava/lang/Object;Ll/ܶ۠ᩴ;)Ll/ܽ۠ᩴ;
    .locals 0

    .line 75
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    invoke-static {p2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    sget-object p1, Ll/ܽ۠ᩴ;->CONTINUE:Ll/ܽ۠ᩴ;

    return-object p1
.end method

.method public visitFileFailed(Ljava/lang/Object;Ljava/io/IOException;)Ll/ܽ۠ᩴ;
    .locals 0

    .line 90
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    throw p2
.end method
