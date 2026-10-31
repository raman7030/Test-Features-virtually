.class public final Ll/᩸ۜܽ;
.super Ljava/lang/Object;
.source "I1MH"


# instance fields
.field public ֫:Ljava/lang/Long;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 8
    iput-object v0, p0, Ll/᩸ۜܽ;->֫:Ljava/lang/Long;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 21
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Ref<"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/᩸ۜܽ;->֫:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x3e

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ljava/lang/Object;
    .locals 1

    .line 12
    iget-object v0, p0, Ll/᩸ۜܽ;->֫:Ljava/lang/Long;

    return-object v0
.end method

.method public final ֫(Ljava/lang/Long;)V
    .locals 0

    .line 16
    iput-object p1, p0, Ll/᩸ۜܽ;->֫:Ljava/lang/Long;

    return-void
.end method
