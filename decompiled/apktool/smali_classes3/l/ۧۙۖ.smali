.class public final Ll/ۧۙۖ;
.super Ljava/lang/Object;
.source "8691"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public ᩶:Ll/֫ۙۖ;

.field public ᩸:Ll/֫ۙۖ;

.field public final ᩹:Ll/ܽۙۖ;


# direct methods
.method public constructor <init>(Ll/ܽۙۖ;Ll/֫ۙۖ;)V
    .locals 0

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    iput-object p1, p0, Ll/ۧۙۖ;->᩹:Ll/ܽۙۖ;

    .line 44
    iput-object p2, p0, Ll/ۧۙۖ;->᩶:Ll/֫ۙۖ;

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    .line 49
    iget-object v0, p0, Ll/ۧۙۖ;->᩶:Ll/֫ۙۖ;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    .line 54
    iget-object v0, p0, Ll/ۧۙۖ;->᩶:Ll/֫ۙۖ;

    iput-object v0, p0, Ll/ۧۙۖ;->᩸:Ll/֫ۙۖ;

    if-eqz v0, :cond_0

    .line 56
    iget-object v1, v0, Ll/֫ۙۖ;->᩻:Ll/֫ۙۖ;

    iput-object v1, p0, Ll/ۧۙۖ;->᩶:Ll/֫ۙۖ;

    return-object v0

    :cond_0
    const/4 v1, 0x0

    .line 58
    iput-object v1, p0, Ll/ۧۙۖ;->᩶:Ll/֫ۙۖ;

    return-object v0
.end method

.method public final remove()V
    .locals 2

    .line 65
    iget-object v0, p0, Ll/ۧۙۖ;->᩸:Ll/֫ۙۖ;

    if-eqz v0, :cond_0

    .line 66
    iget-object v1, p0, Ll/ۧۙۖ;->᩹:Ll/ܽۙۖ;

    invoke-virtual {v1, v0}, Ll/ܽۙۖ;->ܽ(Ll/֫ۙۖ;)V

    const/4 v0, 0x0

    .line 67
    iput-object v0, p0, Ll/ۧۙۖ;->᩸:Ll/֫ۙۖ;

    :cond_0
    return-void
.end method
