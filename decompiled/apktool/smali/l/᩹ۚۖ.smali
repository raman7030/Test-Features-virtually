.class public final Ll/᩹ۚۖ;
.super Ljava/lang/Object;
.source "69OZ"


# instance fields
.field public ֫:[I

.field public ۧ:Ljava/lang/Object;

.field public ܳ:Z

.field public final ܽ:Ljava/util/ArrayList;

.field public ܿ:Ll/ۛ֡ۖ;

.field public ᩳ:Z


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 101
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 94
    iput-object v0, p0, Ll/᩹ۚۖ;->֫:[I

    .line 102
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Ll/᩹ۚۖ;->ܽ:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final ֫()Ll/᩶ۚۖ;
    .locals 8

    .line 129
    iget-boolean v0, p0, Ll/᩹ۚۖ;->ܳ:Z

    if-nez v0, :cond_1

    .line 132
    iget-object v0, p0, Ll/᩹ۚۖ;->ܿ:Ll/ۛ֡ۖ;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 135
    iput-boolean v0, p0, Ll/᩹ۚۖ;->ܳ:Z

    .line 136
    iget-object v0, p0, Ll/᩹ۚۖ;->ܽ:Ljava/util/ArrayList;

    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 137
    new-instance v7, Ll/᩶ۚۖ;

    iget-object v2, p0, Ll/᩹ۚۖ;->ܿ:Ll/ۛ֡ۖ;

    iget-boolean v3, p0, Ll/᩹ۚۖ;->ᩳ:Z

    iget-object v4, p0, Ll/᩹ۚۖ;->֫:[I

    const/4 v1, 0x0

    new-array v1, v1, [Ll/ܺۘۖ;

    .line 141
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, [Ll/ܺۘۖ;

    iget-object v6, p0, Ll/᩹ۚۖ;->ۧ:Ljava/lang/Object;

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, Ll/᩶ۚۖ;-><init>(Ll/ۛ֡ۖ;Z[I[Ll/ܺۘۖ;Ljava/lang/Object;)V

    return-object v7

    .line 133
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Must specify a proto syntax"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 130
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Builder can only build once"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֫(Ll/ۛ֡ۖ;)V
    .locals 1

    const-string v0, "syntax"

    .line 110
    invoke-static {p1, v0}, Ll/ܰᩴۖ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ll/᩹ۚۖ;->ܿ:Ll/ۛ֡ۖ;

    return-void
.end method

.method public final ֫(Ll/ܺۘۖ;)V
    .locals 1

    .line 122
    iget-boolean v0, p0, Ll/᩹ۚۖ;->ܳ:Z

    if-nez v0, :cond_0

    .line 125
    iget-object v0, p0, Ll/᩹ۚۖ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 123
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Builder can only build once"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/᩻֡ۖ;)V
    .locals 0

    .line 106
    iput-object p1, p0, Ll/᩹ۚۖ;->ۧ:Ljava/lang/Object;

    return-void
.end method

.method public final ֫(Z)V
    .locals 0

    .line 114
    iput-boolean p1, p0, Ll/᩹ۚۖ;->ᩳ:Z

    return-void
.end method

.method public final ֫([I)V
    .locals 0

    .line 118
    iput-object p1, p0, Ll/᩹ۚۖ;->֫:[I

    return-void
.end method
