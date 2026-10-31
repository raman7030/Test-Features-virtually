.class public final Ll/۬ᩴܳ;
.super Ll/۬ۗܿ;
.source "715M"


# instance fields
.field public final synthetic ֫֫:Ll/ۜᩴܳ;

.field public final synthetic ۟:I


# direct methods
.method public constructor <init>(Ll/ۗܺ᩷;Ll/ۜᩴܳ;I)V
    .locals 0

    .line 678
    iput-object p2, p0, Ll/۬ᩴܳ;->֫֫:Ll/ۜᩴܳ;

    iput p3, p0, Ll/۬ᩴܳ;->۟:I

    const/4 p2, -0x1

    .line 40
    invoke-direct {p0, p1, p2}, Ll/۬ۗܿ;-><init>(Ll/ۗܺ᩷;I)V

    return-void
.end method


# virtual methods
.method public final ᩴ()V
    .locals 2

    .line 682
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۢ()Ljava/lang/String;

    move-result-object v0

    .line 683
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Ll/۬ᩴܳ;->֫֫:Ll/ۜᩴܳ;

    invoke-virtual {v1}, Ll/ۜᩴܳ;->ܿ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 687
    :cond_0
    invoke-static {v0}, Ll/ۡᩴܳ;->ۧ(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    const v0, 0x7f12042c

    .line 688
    invoke-virtual {p0, v0}, Ll/۬ۗܿ;->ۧ(I)V

    return-void

    .line 691
    :cond_1
    iget v1, p0, Ll/۬ᩴܳ;->۟:I

    invoke-static {v1, v0}, Ll/ۡᩴܳ;->֫(ILjava/lang/String;)V

    .line 692
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۧ()V

    return-void

    .line 684
    :cond_2
    :goto_0
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۧ()V

    return-void
.end method
