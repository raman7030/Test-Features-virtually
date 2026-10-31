.class public final Ll/ۚۨ᩻;
.super Ljava/lang/Object;
.source "L79Z"


# instance fields
.field public ֫:I

.field public ۧ:I

.field public ܽ:I

.field public ܿ:Ljava/lang/CharSequence;

.field public ᩳ:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 155
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    .line 156
    iput-object v0, p0, Ll/ۚۨ᩻;->ܿ:Ljava/lang/CharSequence;

    return-void
.end method


# virtual methods
.method public final ֫(I)Ll/֡ۨ᩻;
    .locals 3

    .line 178
    iget-object v0, p0, Ll/ۚۨ᩻;->ܿ:Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    const/4 v0, 0x0

    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    .line 179
    iget v1, p0, Ll/ۚۨ᩻;->ᩳ:I

    if-ge p1, v1, :cond_0

    .line 180
    iget-object v1, p0, Ll/ۚۨ᩻;->ܿ:Ljava/lang/CharSequence;

    invoke-virtual {p0, v1}, Ll/ۚۨ᩻;->֫(Ljava/lang/CharSequence;)V

    .line 182
    :cond_0
    :goto_0
    iget v1, p0, Ll/ۚۨ᩻;->ᩳ:I

    if-ge v1, p1, :cond_3

    .line 183
    iget-object v2, p0, Ll/ۚۨ᩻;->ܿ:Ljava/lang/CharSequence;

    invoke-interface {v2, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    const/16 v2, 0xa

    if-ne v1, v2, :cond_1

    .line 185
    iget v1, p0, Ll/ۚۨ᩻;->ᩳ:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/ۚۨ᩻;->ᩳ:I

    .line 186
    iget v2, p0, Ll/ۚۨ᩻;->ۧ:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Ll/ۚۨ᩻;->ۧ:I

    .line 187
    iput v1, p0, Ll/ۚۨ᩻;->ܽ:I

    .line 188
    iput v0, p0, Ll/ۚۨ᩻;->֫:I

    goto :goto_0

    .line 190
    :cond_1
    iget v2, p0, Ll/ۚۨ᩻;->ᩳ:I

    .line 203
    invoke-static {v1}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v1

    if-eqz v1, :cond_2

    iget v1, p0, Ll/ۚۨ᩻;->ܽ:I

    if-le v2, v1, :cond_2

    iget-object v1, p0, Ll/ۚۨ᩻;->ܿ:Ljava/lang/CharSequence;

    add-int/lit8 v2, v2, -0x1

    .line 204
    invoke-interface {v1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    invoke-static {v1}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    .line 191
    :cond_2
    iget v1, p0, Ll/ۚۨ᩻;->֫:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/ۚۨ᩻;->֫:I

    .line 193
    :goto_1
    iget v1, p0, Ll/ۚۨ᩻;->ᩳ:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/ۚۨ᩻;->ᩳ:I

    goto :goto_0

    .line 196
    :cond_3
    new-instance p1, Ll/֡ۨ᩻;

    iget v0, p0, Ll/ۚۨ᩻;->ۧ:I

    iget v1, p0, Ll/ۚۨ᩻;->֫:I

    invoke-direct {p1, v0, v1}, Ll/֡ۨ᩻;-><init>(II)V

    return-object p1
.end method

.method public final ֫(Ljava/lang/CharSequence;)V
    .locals 0

    .line 166
    iput-object p1, p0, Ll/ۚۨ᩻;->ܿ:Ljava/lang/CharSequence;

    const/4 p1, 0x0

    .line 167
    iput p1, p0, Ll/ۚۨ᩻;->ᩳ:I

    .line 168
    iput p1, p0, Ll/ۚۨ᩻;->ۧ:I

    .line 169
    iput p1, p0, Ll/ۚۨ᩻;->ܽ:I

    .line 170
    iput p1, p0, Ll/ۚۨ᩻;->֫:I

    return-void
.end method
