.class public final Ll/ۜܺۚ;
.super Ll/ܳܿ֡;
.source "65LR"


# instance fields
.field public ۫:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/ۨᩳ֡;Ljava/lang/String;)V
    .locals 0

    .line 38
    invoke-direct {p0, p1}, Ll/ܳܿ֡;-><init>(Ll/ۨᩳ֡;)V

    .line 39
    iput-object p2, p0, Ll/ۜܺۚ;->۫:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final getMessage()Ljava/lang/String;
    .locals 3

    .line 43
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/ۜܺۚ;->۫:Ljava/lang/String;

    const-string v2, " is an odexed instruction. You cannot reassemble a disassembled odex file unless it has been deodexed."

    .line 0
    invoke-static {v0, v1, v2}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
