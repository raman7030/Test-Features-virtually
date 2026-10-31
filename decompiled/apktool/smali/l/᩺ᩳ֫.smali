.class public final Ll/᩺ᩳ֫;
.super Ljava/lang/Object;
.source "LB1M"


# instance fields
.field public final ֫:[C

.field public final ۧ:Ll/ۜܿ֫;

.field public final ܽ:Ll/ۨᩳ֫;

.field public final ᩳ:Landroid/graphics/Typeface;


# direct methods
.method public constructor <init>(Landroid/graphics/Typeface;Ll/ۜܿ֫;)V
    .locals 5

    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 77
    iput-object p1, p0, Ll/᩺ᩳ֫;->ᩳ:Landroid/graphics/Typeface;

    .line 78
    iput-object p2, p0, Ll/᩺ᩳ֫;->ۧ:Ll/ۜܿ֫;

    .line 79
    new-instance p1, Ll/ۨᩳ֫;

    const/16 v0, 0x400

    invoke-direct {p1, v0}, Ll/ۨᩳ֫;-><init>(I)V

    iput-object p1, p0, Ll/᩺ᩳ֫;->ܽ:Ll/ۨᩳ֫;

    .line 80
    invoke-virtual {p2}, Ll/ۜܿ֫;->֫()I

    move-result p1

    mul-int/lit8 p1, p1, 0x2

    new-array p1, p1, [C

    iput-object p1, p0, Ll/᩺ᩳ֫;->֫:[C

    .line 161
    invoke-virtual {p2}, Ll/ۜܿ֫;->֫()I

    move-result p1

    const/4 p2, 0x0

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p1, :cond_1

    .line 163
    new-instance v1, Ll/֫ܿ֫;

    invoke-direct {v1, p0, v0}, Ll/֫ܿ֫;-><init>(Ll/᩺ᩳ֫;I)V

    .line 167
    invoke-virtual {v1}, Ll/֫ܿ֫;->ᩳ()I

    move-result v2

    iget-object v3, p0, Ll/᩺ᩳ֫;->֫:[C

    mul-int/lit8 v4, v0, 0x2

    invoke-static {v2, v3, v4}, Ljava/lang/Character;->toChars(I[CI)I

    .line 225
    invoke-virtual {v1}, Ll/֫ܿ֫;->֫()I

    move-result v2

    if-lez v2, :cond_0

    const/4 v2, 0x1

    goto :goto_1

    :cond_0
    const/4 v2, 0x0

    :goto_1
    const-string v3, "invalid metadata codepoint length"

    invoke-static {v3, v2}, Ll/ܰۤ;->֫(Ljava/lang/String;Z)V

    .line 228
    iget-object v2, p0, Ll/᩺ᩳ֫;->ܽ:Ll/ۨᩳ֫;

    invoke-virtual {v1}, Ll/֫ܿ֫;->֫()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    invoke-virtual {v2, v1, p2, v3}, Ll/ۨᩳ֫;->֫(Ll/֫ܿ֫;II)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static ֫(Landroid/graphics/Typeface;Ljava/nio/MappedByteBuffer;)Ll/᩺ᩳ֫;
    .locals 2

    :try_start_0
    const-string v0, "EmojiCompat.MetadataRepo.create"

    .line 130
    sget v1, Ll/ۚ۫;->֫:I

    .line 108
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 131
    new-instance v0, Ll/᩺ᩳ֫;

    invoke-static {p1}, Ll/ۛᩳ֫;->֫(Ljava/nio/MappedByteBuffer;)Ll/ۜܿ֫;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Ll/᩺ᩳ֫;-><init>(Landroid/graphics/Typeface;Ll/ۜܿ֫;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 119
    invoke-static {}, Landroid/os/Trace;->endSection()V

    return-object v0

    :catchall_0
    move-exception p0

    .line 133
    sget p1, Ll/ۚ۫;->֫:I

    .line 119
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 134
    throw p0
.end method


# virtual methods
.method public final ֫()[C
    .locals 1

    .line 204
    iget-object v0, p0, Ll/᩺ᩳ֫;->֫:[C

    return-object v0
.end method

.method public final ۧ()Ll/ۜܿ֫;
    .locals 1

    .line 213
    iget-object v0, p0, Ll/᩺ᩳ֫;->ۧ:Ll/ۜܿ֫;

    return-object v0
.end method

.method public final ܽ()I
    .locals 1

    .line 186
    iget-object v0, p0, Ll/᩺ᩳ֫;->ۧ:Ll/ۜܿ֫;

    invoke-virtual {v0}, Ll/ۜܿ֫;->ۧ()I

    move-result v0

    return v0
.end method

.method public final ܿ()Landroid/graphics/Typeface;
    .locals 1

    .line 178
    iget-object v0, p0, Ll/᩺ᩳ֫;->ᩳ:Landroid/graphics/Typeface;

    return-object v0
.end method

.method public final ᩳ()Ll/ۨᩳ֫;
    .locals 1

    .line 195
    iget-object v0, p0, Ll/᩺ᩳ֫;->ܽ:Ll/ۨᩳ֫;

    return-object v0
.end method
