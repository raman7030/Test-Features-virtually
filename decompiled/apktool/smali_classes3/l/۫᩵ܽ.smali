.class public final Ll/۫᩵ܽ;
.super Ljava/lang/Object;
.source "S6VA"


# instance fields
.field public final ֫:I

.field public final ۧ:[I

.field public final ܳ:Z

.field public final ܽ:[I

.field public final ܿ:I

.field public final ᩳ:[I


# direct methods
.method public constructor <init>(Ll/۫֡ܽ;I)V
    .locals 2

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    iget-object v0, p1, Ll/۫֡ܽ;->ۧ:[I

    invoke-virtual {v0}, [I->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    iput-object v0, p0, Ll/۫᩵ܽ;->ᩳ:[I

    .line 11
    iget-object v1, p1, Ll/۫֡ܽ;->ܽ:[I

    invoke-virtual {v1}, [I->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [I

    iput-object v1, p0, Ll/۫᩵ܽ;->ܽ:[I

    .line 12
    iget-object v1, p1, Ll/۫֡ܽ;->ᩳ:[I

    invoke-virtual {v1}, [I->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [I

    iput-object v1, p0, Ll/۫᩵ܽ;->ۧ:[I

    .line 13
    iput p2, p0, Ll/۫᩵ܽ;->ܿ:I

    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    const-class v1, Ll/ۤ֡ܽ;

    if-ne p2, v1, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    iput-boolean p2, p0, Ll/۫᩵ܽ;->ܳ:Z

    if-eqz p2, :cond_1

    .line 15
    check-cast p1, Ll/ۤ֡ܽ;

    iget p1, p1, Ll/ۤ֡ܽ;->ܿ:I

    goto :goto_1

    :cond_1
    array-length p1, v0

    :goto_1
    iput p1, p0, Ll/۫᩵ܽ;->֫:I

    return-void
.end method
