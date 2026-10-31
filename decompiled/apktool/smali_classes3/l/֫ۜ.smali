.class public final Ll/֫ۜ;
.super Ll/֨ۧܺ;
.source "B54W"


# instance fields
.field public ֫:I

.field public ۧ:Z

.field public final synthetic ܽ:Ll/ۧۜ;


# direct methods
.method public constructor <init>(Ll/ۧۜ;)V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 120
    iput-object p1, p0, Ll/֫ۜ;->ܽ:Ll/ۧۜ;

    const/4 p1, 0x0

    .line 121
    iput-boolean p1, p0, Ll/֫ۜ;->ۧ:Z

    .line 122
    iput p1, p0, Ll/֫ۜ;->֫:I

    return-void
.end method


# virtual methods
.method public final onAnimationEnd()V
    .locals 3

    .line 143
    iget v0, p0, Ll/֫ۜ;->֫:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/֫ۜ;->֫:I

    iget-object v1, p0, Ll/֫ۜ;->ܽ:Ll/ۧۜ;

    iget-object v2, v1, Ll/ۧۜ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ne v0, v2, :cond_1

    .line 144
    iget-object v0, v1, Ll/ۧۜ;->ܿ:Ll/᩸᩺;

    if-eqz v0, :cond_0

    .line 145
    invoke-interface {v0}, Ll/᩸᩺;->onAnimationEnd()V

    :cond_0
    const/4 v0, 0x0

    .line 136
    iput v0, p0, Ll/֫ۜ;->֫:I

    .line 137
    iput-boolean v0, p0, Ll/֫ۜ;->ۧ:Z

    .line 138
    invoke-virtual {v1}, Ll/ۧۜ;->ۧ()V

    :cond_1
    return-void
.end method

.method public final ֫()V
    .locals 1

    .line 126
    iget-boolean v0, p0, Ll/֫ۜ;->ۧ:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 129
    iput-boolean v0, p0, Ll/֫ۜ;->ۧ:Z

    .line 130
    iget-object v0, p0, Ll/֫ۜ;->ܽ:Ll/ۧۜ;

    iget-object v0, v0, Ll/ۧۜ;->ܿ:Ll/᩸᩺;

    if-eqz v0, :cond_1

    .line 131
    invoke-interface {v0}, Ll/᩸᩺;->֫()V

    :cond_1
    :goto_0
    return-void
.end method
