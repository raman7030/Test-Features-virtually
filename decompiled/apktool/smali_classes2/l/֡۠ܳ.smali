.class public final Ll/֡۠ܳ;
.super Ll/۬ᩴܺ;
.source "052E"


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۧ:Z

.field public final ܽ:Ljava/lang/String;

.field public final ᩳ:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 0
    invoke-direct {p0, p2, p3, p4, p5}, Ll/֡۠ܳ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 385
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֡۠ܳ;->֫:Ljava/lang/String;

    iput-object p2, p0, Ll/֡۠ܳ;->ᩳ:Ljava/lang/String;

    iput-object p3, p0, Ll/֡۠ܳ;->ܽ:Ljava/lang/String;

    iput-boolean p4, p0, Ll/֡۠ܳ;->ۧ:Z

    return-void
.end method

.method public static bridge synthetic ֫(Ll/֡۠ܳ;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֡۠ܳ;->֫:Ljava/lang/String;

    return-object p0
.end method

.method public static ֫(Ll/۬ۜܽ;)Ll/֡۠ܳ;
    .locals 4

    .line 388
    new-instance v0, Ll/֡۠ܳ;

    invoke-virtual {p0}, Ll/۬ۜܽ;->᩹()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Ll/۬ۜܽ;->᩹()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Ll/۬ۜܽ;->᩹()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Ll/۬ۜܽ;->readByte()B

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    invoke-direct {v0, v1, v2, v3, p0}, Ll/֡۠ܳ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v0
.end method

.method public static bridge synthetic ۧ(Ll/֡۠ܳ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/֡۠ܳ;->ۧ:Z

    return p0
.end method

.method public static bridge synthetic ܽ(Ll/֡۠ܳ;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֡۠ܳ;->ܽ:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/֡۠ܳ;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֡۠ܳ;->ᩳ:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 385
    instance-of v0, p1, Ll/֡۠ܳ;

    if-eqz v0, :cond_0

    check-cast p1, Ll/֡۠ܳ;

    iget-boolean v0, p0, Ll/֡۠ܳ;->ۧ:Z

    iget-boolean v1, p1, Ll/֡۠ܳ;->ۧ:Z

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ll/֡۠ܳ;->֫:Ljava/lang/String;

    iget-object v1, p1, Ll/֡۠ܳ;->֫:Ljava/lang/String;

    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/֡۠ܳ;->ᩳ:Ljava/lang/String;

    iget-object v1, p1, Ll/֡۠ܳ;->ᩳ:Ljava/lang/String;

    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/֡۠ܳ;->ܽ:Ljava/lang/String;

    iget-object p1, p1, Ll/֡۠ܳ;->ܽ:Ljava/lang/String;

    invoke-static {v0, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 3

    .line 0
    iget-boolean v0, p0, Ll/֡۠ܳ;->ۧ:Z

    if-eqz v0, :cond_0

    const/16 v0, 0x4cf

    goto :goto_0

    :cond_0
    const/16 v0, 0x4d5

    :goto_0
    const/16 v1, 0x1f

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Ll/֡۠ܳ;->֫:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ll/᩶ᩴᩳ;->֫(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Ll/֡۠ܳ;->ᩳ:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ll/᩶ᩴᩳ;->֫(IILjava/lang/String;)I

    move-result v0

    .line 385
    iget-object v1, p0, Ll/֡۠ܳ;->ܽ:Ljava/lang/String;

    invoke-static {v1}, Ll/ۧ۫ᩴ;->hashCode(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    .line 385
    iget-boolean v0, p0, Ll/֡۠ܳ;->ۧ:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p0, Ll/֡۠ܳ;->֫:Ljava/lang/String;

    aput-object v3, v1, v2

    const/4 v3, 0x1

    iget-object v4, p0, Ll/֡۠ܳ;->ᩳ:Ljava/lang/String;

    aput-object v4, v1, v3

    const/4 v4, 0x2

    iget-object v5, p0, Ll/֡۠ܳ;->ܽ:Ljava/lang/String;

    aput-object v5, v1, v4

    const/4 v4, 0x3

    aput-object v0, v1, v4

    const-string v0, "pattern;search;replace;regex"

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_0

    new-array v0, v2, [Ljava/lang/String;

    goto :goto_0

    :cond_0
    const-string v4, ";"

    invoke-virtual {v0, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    :goto_0
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "["

    .line 0
    const-class v6, Ll/֡۠ܳ;

    invoke-static {v6, v4, v5}, Ll/ۘ᩺ۘ;->֫(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 385
    :goto_1
    array-length v5, v0

    if-ge v2, v5, :cond_2

    aget-object v5, v0, v2

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v5, v1, v2

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    array-length v5, v0

    sub-int/2addr v5, v3

    if-eq v2, v5, :cond_1

    const-string v5, ", "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    const-string v0, "]"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Landroid/text/SpannableStringBuilder;
    .locals 6

    .line 400
    new-instance v0, Landroid/text/SpannableStringBuilder;

    iget-object v1, p0, Ll/֡۠ܳ;->֫:Ljava/lang/String;

    const/16 v2, 0xa

    const/16 v3, 0x20

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v4}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 401
    iget-object v4, p0, Ll/֡۠ܳ;->ᩳ:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_0

    const-string v5, " ["

    .line 402
    invoke-virtual {v0, v5}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    move-result-object v5

    invoke-virtual {v4, v2, v3}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    move-result-object v4

    const-string v5, "] > ["

    invoke-virtual {v4, v5}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    move-result-object v4

    iget-object v5, p0, Ll/֡۠ܳ;->ܽ:Ljava/lang/String;

    .line 403
    invoke-virtual {v5, v2, v3}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    move-result-object v2

    const-string v3, "]"

    invoke-virtual {v2, v3}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 404
    new-instance v2, Landroid/text/style/ForegroundColorSpan;

    sget v3, Ll/᩹֡᩷;->ۜ֫:I

    invoke-direct {v2, v3}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {v0}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v4

    const/16 v5, 0x21

    invoke-virtual {v0, v2, v3, v4, v5}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 405
    new-instance v2, Landroid/text/style/RelativeSizeSpan;

    const/high16 v3, 0x3f400000    # 0.75f

    invoke-direct {v2, v3}, Landroid/text/style/RelativeSizeSpan;-><init>(F)V

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {v0}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v3

    invoke-virtual {v0, v2, v1, v3, v5}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    :cond_0
    return-object v0
.end method

.method public final ֫(Ll/ۤۜܽ;)V
    .locals 1

    .line 392
    iget-object v0, p0, Ll/֡۠ܳ;->֫:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->ܿ(Ljava/lang/String;)V

    .line 393
    iget-object v0, p0, Ll/֡۠ܳ;->ᩳ:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->ܿ(Ljava/lang/String;)V

    .line 394
    iget-object v0, p0, Ll/֡۠ܳ;->ܽ:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->ܿ(Ljava/lang/String;)V

    .line 395
    iget-boolean v0, p0, Ll/֡۠ܳ;->ۧ:Z

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->writeByte(I)V

    return-void
.end method
