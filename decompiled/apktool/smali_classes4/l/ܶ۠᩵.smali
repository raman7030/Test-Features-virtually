.class public final Ll/ܶ۠᩵;
.super Ljava/lang/Object;
.source "NAYZ"

# interfaces
.implements Ll/ܿ۠᩵;
.implements Ljava/io/Serializable;


# instance fields
.field public ᩸:Ljava/lang/Object;

.field public ᩹:Ll/֫᩹᩵;


# direct methods
.method public constructor <init>(Ll/֫᩹᩵;)V
    .locals 0

    .line 93
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 94
    iput-object p1, p0, Ll/ܶ۠᩵;->᩹:Ll/֫᩹᩵;

    .line 95
    sget-object p1, Ll/ۚ۠᩵;->֫:Ll/ۚ۠᩵;

    iput-object p1, p0, Ll/ܶ۠᩵;->᩸:Ljava/lang/Object;

    return-void
.end method

.method private final readObject(Ljava/io/ObjectInputStream;)V
    .locals 1

    .line 113
    new-instance p1, Ljava/io/InvalidObjectException;

    const-string v0, "Deserialization is supported via proxy only"

    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final writeReplace()Ljava/lang/Object;
    .locals 2

    .line 111
    new-instance v0, Ll/ᩳ۠᩵;

    invoke-virtual {p0}, Ll/ܶ۠᩵;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/ᩳ۠᩵;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public final getValue()Ljava/lang/Object;
    .locals 2

    .line 99
    iget-object v0, p0, Ll/ܶ۠᩵;->᩸:Ljava/lang/Object;

    sget-object v1, Ll/ۚ۠᩵;->֫:Ll/ۚ۠᩵;

    if-ne v0, v1, :cond_0

    .line 100
    iget-object v0, p0, Ll/ܶ۠᩵;->᩹:Ll/֫᩹᩵;

    invoke-static {v0}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    invoke-interface {v0}, Ll/֫᩹᩵;->֫()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Ll/ܶ۠᩵;->᩸:Ljava/lang/Object;

    const/4 v0, 0x0

    .line 101
    iput-object v0, p0, Ll/ܶ۠᩵;->᩹:Ll/֫᩹᩵;

    .line 104
    :cond_0
    iget-object v0, p0, Ll/ܶ۠᩵;->᩸:Ljava/lang/Object;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 107
    iget-object v0, p0, Ll/ܶ۠᩵;->᩸:Ljava/lang/Object;

    sget-object v1, Ll/ۚ۠᩵;->֫:Ll/ۚ۠᩵;

    if-eq v0, v1, :cond_0

    .line 109
    invoke-virtual {p0}, Ll/ܶ۠᩵;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, "Lazy value not initialized yet."

    return-object v0
.end method
