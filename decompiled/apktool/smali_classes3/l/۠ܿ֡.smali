.class public abstract Ll/۠ܿ֡;
.super Ljava/lang/Object;
.source "Z69D"


# instance fields
.field public ֫:Ll/ۛ᩸ۘ;

.field public ۧ:I

.field public ܳ:Ljava/lang/Object;

.field public ܽ:Z

.field public ܿ:Ljava/util/ArrayList;

.field public ᩳ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/ۛ᩸ۘ;Ljava/lang/String;)V
    .locals 1

    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 50
    iput v0, p0, Ll/۠ܿ֡;->ۧ:I

    .line 68
    iput-boolean v0, p0, Ll/۠ܿ֡;->ܽ:Z

    .line 78
    iput-object p2, p0, Ll/۠ܿ֡;->ᩳ:Ljava/lang/String;

    .line 79
    iput-object p1, p0, Ll/۠ܿ֡;->֫:Ll/ۛ᩸ۘ;

    return-void
.end method

.method public constructor <init>(Ll/ۛ᩸ۘ;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    .line 88
    invoke-direct {p0, p1, p2}, Ll/۠ܿ֡;-><init>(Ll/ۛ᩸ۘ;Ljava/lang/String;)V

    .line 89
    invoke-virtual {p0, p3}, Ll/۠ܿ֡;->֫(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/lang/Object;
    .locals 4

    .line 199
    iget-object v0, p0, Ll/۠ܿ֡;->ܳ:Ljava/lang/Object;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 202
    :goto_0
    iget-object v2, p0, Ll/۠ܿ֡;->ܿ:Ljava/util/ArrayList;

    if-eqz v2, :cond_1

    .line 203
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 157
    :cond_1
    iget-object v2, p0, Ll/۠ܿ֡;->ᩳ:Ljava/lang/String;

    if-eqz v0, :cond_5

    .line 160
    iget v3, p0, Ll/۠ܿ֡;->ۧ:I

    if-lt v3, v0, :cond_3

    if-ne v0, v1, :cond_2

    .line 162
    iget-object v0, p0, Ll/۠ܿ֡;->ܳ:Ljava/lang/Object;

    invoke-virtual {p0, v0}, Ll/۠ܿ֡;->ۧ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 165
    :cond_2
    new-instance v0, Ll/ۚܿ֡;

    invoke-direct {v0, v2}, Ll/ۚܿ֡;-><init>(Ljava/lang/String;)V

    throw v0

    .line 168
    :cond_3
    iget-object v0, p0, Ll/۠ܿ֡;->ܳ:Ljava/lang/Object;

    if-eqz v0, :cond_4

    add-int/2addr v3, v1

    .line 169
    iput v3, p0, Ll/۠ܿ֡;->ۧ:I

    .line 170
    invoke-virtual {p0, v0}, Ll/۠ܿ֡;->ۧ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 173
    :cond_4
    iget-object v0, p0, Ll/۠ܿ֡;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/۠ܿ֡;->ۧ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 174
    iget v2, p0, Ll/۠ܿ֡;->ۧ:I

    add-int/2addr v2, v1

    iput v2, p0, Ll/۠ܿ֡;->ۧ:I

    return-object v0

    .line 158
    :cond_5
    new-instance v0, Ll/֨ܿ֡;

    .line 33
    invoke-direct {v0, v2}, Ll/ۚܿ֡;-><init>(Ljava/lang/String;)V

    .line 158
    throw v0
.end method

.method public final ֫(Ljava/lang/Object;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 117
    :cond_0
    iget-object v0, p0, Ll/۠ܿ֡;->ܿ:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    .line 118
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 121
    :cond_1
    iget-object v0, p0, Ll/۠ܿ֡;->ܳ:Ljava/lang/Object;

    if-nez v0, :cond_2

    .line 122
    iput-object p1, p0, Ll/۠ܿ֡;->ܳ:Ljava/lang/Object;

    return-void

    .line 126
    :cond_2
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Ll/۠ܿ֡;->ܿ:Ljava/util/ArrayList;

    .line 127
    iget-object v1, p0, Ll/۠ܿ֡;->ܳ:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x0

    .line 128
    iput-object v0, p0, Ll/۠ܿ֡;->ܳ:Ljava/lang/Object;

    .line 129
    iget-object v0, p0, Ll/۠ܿ֡;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public ۧ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    return-object p1
.end method

.method public final ۧ()Z
    .locals 3

    .line 193
    iget-object v0, p0, Ll/۠ܿ֡;->ܳ:Ljava/lang/Object;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget v0, p0, Ll/۠ܿ֡;->ۧ:I

    if-lt v0, v1, :cond_1

    :cond_0
    iget-object v0, p0, Ll/۠ܿ֡;->ܿ:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    iget v2, p0, Ll/۠ܿ֡;->ۧ:I

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v2, v0, :cond_2

    :cond_1
    return v1

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ()Ljava/lang/Object;
    .locals 3

    .line 199
    iget-object v0, p0, Ll/۠ܿ֡;->ܳ:Ljava/lang/Object;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 202
    :goto_0
    iget-object v2, p0, Ll/۠ܿ֡;->ܿ:Ljava/util/ArrayList;

    if-eqz v2, :cond_1

    .line 203
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 139
    :cond_1
    iget-boolean v2, p0, Ll/۠ܿ֡;->ܽ:Z

    if-nez v2, :cond_3

    iget v2, p0, Ll/۠ܿ֡;->ۧ:I

    if-lt v2, v0, :cond_2

    if-ne v0, v1, :cond_2

    goto :goto_1

    .line 145
    :cond_2
    invoke-virtual {p0}, Ll/۠ܿ֡;->֫()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 141
    :cond_3
    :goto_1
    invoke-virtual {p0}, Ll/۠ܿ֡;->֫()Ljava/lang/Object;

    move-result-object v0

    .line 142
    move-object v1, p0

    check-cast v1, Ll/ܶܿ֡;

    .line 87
    iget-object v1, v1, Ll/۠ܿ֡;->֫:Ll/ۛ᩸ۘ;

    const/4 v2, 0x0

    .line 78
    invoke-virtual {v1, v0, v2}, Ll/ۛ᩸ۘ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ll/᩹ܿ֡;

    move-result-object v0

    return-object v0
.end method

.method public final ᩳ()V
    .locals 1

    const/4 v0, 0x0

    .line 108
    iput v0, p0, Ll/۠ܿ֡;->ۧ:I

    const/4 v0, 0x1

    .line 109
    iput-boolean v0, p0, Ll/۠ܿ֡;->ܽ:Z

    return-void
.end method
