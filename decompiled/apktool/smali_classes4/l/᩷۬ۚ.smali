.class public final Ll/᩷۬ۚ;
.super Ljava/lang/Object;
.source "KBGJ"


# instance fields
.field public final ֫:[B

.field public final ۧ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;[B)V
    .locals 0

    .line 114
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 115
    iput-object p1, p0, Ll/᩷۬ۚ;->ۧ:Ljava/lang/String;

    .line 116
    iput-object p2, p0, Ll/᩷۬ۚ;->֫:[B

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 129
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/᩷۬ۚ;->ۧ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩷۬ۚ;->֫:[B

    array-length v1, v1

    const-string v2, "b"

    .line 0
    invoke-static {v1, v2, v0}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()[B
    .locals 1

    .line 124
    iget-object v0, p0, Ll/᩷۬ۚ;->֫:[B

    return-object v0
.end method
