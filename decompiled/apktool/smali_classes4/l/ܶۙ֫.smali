.class public final Ll/ܶۙ֫;
.super Ljava/lang/Object;
.source "V8T2"


# instance fields
.field public ֫:I

.field public ۧ:Z

.field public ܽ:I

.field public ܿ:Z

.field public ᩳ:Ll/۬ۗ֫;


# direct methods
.method public constructor <init>(Ll/۬ۗ֫;)V
    .locals 0

    .line 110
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 111
    iput-object p1, p0, Ll/ܶۙ֫;->ᩳ:Ll/۬ۗ֫;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܶۙ֫;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ܶۙ֫;->ۧ:Z

    return p0
.end method


# virtual methods
.method public final ֫(I)V
    .locals 2

    .line 115
    iget-boolean v0, p0, Ll/ܶۙ֫;->ۧ:Z

    if-lez p1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Ll/ܶۙ֫;->ۧ:Z

    .line 116
    iget v0, p0, Ll/ܶۙ֫;->ܽ:I

    add-int/2addr v0, p1

    iput v0, p0, Ll/ܶۙ֫;->ܽ:I

    return-void
.end method

.method public final ֫(Ll/۬ۗ֫;)V
    .locals 2

    .line 120
    iget-boolean v0, p0, Ll/ܶۙ֫;->ۧ:Z

    iget-object v1, p0, Ll/ܶۙ֫;->ᩳ:Ll/۬ۗ֫;

    if-eq v1, p1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Ll/ܶۙ֫;->ۧ:Z

    .line 121
    iput-object p1, p0, Ll/ܶۙ֫;->ᩳ:Ll/۬ۗ֫;

    return-void
.end method

.method public final ۧ(I)V
    .locals 3

    .line 125
    iget-boolean v0, p0, Ll/ܶۙ֫;->ܿ:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    iget v0, p0, Ll/ܶۙ֫;->֫:I

    const/4 v2, 0x5

    if-eq v0, v2, :cond_1

    if-ne p1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 129
    :goto_0
    invoke-static {v1}, Ll/᩺֡֫;->֫(Z)V

    return-void

    .line 132
    :cond_1
    iput-boolean v1, p0, Ll/ܶۙ֫;->ۧ:Z

    .line 133
    iput-boolean v1, p0, Ll/ܶۙ֫;->ܿ:Z

    .line 134
    iput p1, p0, Ll/ܶۙ֫;->֫:I

    return-void
.end method
