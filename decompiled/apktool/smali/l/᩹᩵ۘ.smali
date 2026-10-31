.class public abstract Ll/᩹᩵ۘ;
.super Ljava/lang/Object;
.source "X8B3"


# instance fields
.field public ֫:[Ljava/lang/String;


# direct methods
.method public constructor <init>([Ljava/lang/String;)V
    .locals 0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Ll/᩹᩵ۘ;->֫:[Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 66
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "SonivoxVoiceDescription["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 45
    iget-object v1, p0, Ll/᩹᩵ۘ;->֫:[Ljava/lang/String;

    array-length v1, v1

    const-string v2, "]"

    .line 0
    invoke-static {v1, v2, v0}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public abstract ֫()Ll/᩷᩵ۘ;
.end method

.method public final ۧ()I
    .locals 1

    .line 45
    iget-object v0, p0, Ll/᩹᩵ۘ;->֫:[Ljava/lang/String;

    array-length v0, v0

    return v0
.end method

.method public final ܽ()[Ljava/lang/String;
    .locals 1

    .line 49
    iget-object v0, p0, Ll/᩹᩵ۘ;->֫:[Ljava/lang/String;

    return-object v0
.end method
