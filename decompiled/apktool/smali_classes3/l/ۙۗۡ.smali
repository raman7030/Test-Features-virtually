.class public abstract Ll/ۙۗۡ;
.super Ljava/lang/Object;
.source "N326"

# interfaces
.implements Ll/ᩴ۬ۡ;


# instance fields
.field public ֫:I

.field public final ۧ:Ll/᩹ۗۡ;

.field public ܽ:Ll/ܽۙۡ;

.field public ܿ:Ljava/lang/Object;

.field public ᩳ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/᩹ۗۡ;)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Ll/ۙۗۡ;->ۧ:Ll/᩹ۗۡ;

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/lang/Object;
    .locals 1

    .line 48
    iget-object v0, p0, Ll/ۙۗۡ;->ܿ:Ljava/lang/Object;

    return-object v0
.end method

.method public final ֫(I)V
    .locals 0

    .line 42
    iput p1, p0, Ll/ۙۗۡ;->֫:I

    return-void
.end method

.method public final ֫(Ljava/lang/Object;)V
    .locals 0

    .line 53
    iput-object p1, p0, Ll/ۙۗۡ;->ܿ:Ljava/lang/Object;

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 1

    .line 26
    iget-object v0, p0, Ll/ۙۗۡ;->ۧ:Ll/᩹ۗۡ;

    invoke-virtual {v0, p1}, Ll/᩹ۗۡ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ۙۗۡ;->ᩳ:Ljava/lang/String;

    return-void
.end method

.method public final ֫(Ll/ܽۙۡ;)V
    .locals 0

    .line 34
    iput-object p1, p0, Ll/ۙۗۡ;->ܽ:Ll/ܽۙۡ;

    return-void
.end method

.method public abstract ֫(Ll/᩶ۗۡ;Ll/ۖ۬ۡ;)V
.end method

.method public final ۧ()I
    .locals 1

    .line 38
    iget v0, p0, Ll/ۙۗۡ;->֫:I

    return v0
.end method

.method public final ܽ()Ll/ܽۙۡ;
    .locals 1

    .line 30
    iget-object v0, p0, Ll/ۙۗۡ;->ܽ:Ll/ܽۙۡ;

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    .line 22
    iget-object v0, p0, Ll/ۙۗۡ;->ᩳ:Ljava/lang/String;

    return-object v0
.end method
