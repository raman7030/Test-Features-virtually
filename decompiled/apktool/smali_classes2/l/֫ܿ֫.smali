.class public final Ll/֫ܿ֫;
.super Ljava/lang/Object;
.source "D96H"


# static fields
.field public static final ᩳ:Ljava/lang/ThreadLocal;


# instance fields
.field public volatile ֫:I

.field public final ۧ:I

.field public final ܽ:Ll/᩺ᩳ֫;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 89
    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, Ll/֫ܿ֫;->ᩳ:Ljava/lang/ThreadLocal;

    return-void
.end method

.method public constructor <init>(Ll/᩺ᩳ֫;I)V
    .locals 1

    .line 115
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 108
    iput v0, p0, Ll/֫ܿ֫;->֫:I

    .line 116
    iput-object p1, p0, Ll/֫ܿ֫;->ܽ:Ll/᩺ᩳ֫;

    .line 117
    iput p2, p0, Ll/֫ܿ֫;->ۧ:I

    return-void
.end method

.method private ۢ()Ll/᩻ܿ֫;
    .locals 3

    .line 154
    sget-object v0, Ll/֫ܿ֫;->ᩳ:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩻ܿ֫;

    if-nez v1, :cond_0

    .line 156
    new-instance v1, Ll/᩻ܿ֫;

    invoke-direct {v1}, Ll/᩻ܿ֫;-><init>()V

    .line 157
    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 167
    :cond_0
    iget-object v0, p0, Ll/֫ܿ֫;->ܽ:Ll/᩺ᩳ֫;

    invoke-virtual {v0}, Ll/᩺ᩳ֫;->ۧ()Ll/ۜܿ֫;

    move-result-object v0

    iget v2, p0, Ll/֫ܿ֫;->ۧ:I

    invoke-virtual {v0, v1, v2}, Ll/ۜܿ֫;->֫(Ll/᩻ܿ֫;I)V

    return-object v1
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 319
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 320
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", id:"

    .line 321
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 322
    invoke-virtual {p0}, Ll/֫ܿ֫;->ᩳ()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", codepoints:"

    .line 323
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 324
    invoke-virtual {p0}, Ll/֫ܿ֫;->֫()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    .line 326
    invoke-virtual {p0, v2}, Ll/֫ܿ֫;->֫(I)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " "

    .line 327
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 329
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()I
    .locals 1

    .line 313
    invoke-direct {p0}, Ll/֫ܿ֫;->ۢ()Ll/᩻ܿ֫;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩻ܿ֫;->֫()I

    move-result v0

    return v0
.end method

.method public final ֫(I)I
    .locals 1

    .line 306
    invoke-direct {p0}, Ll/֫ܿ֫;->ۢ()Ll/᩻ܿ֫;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/᩻ܿ֫;->ۧ(I)I

    move-result p1

    return p1
.end method

.method public final ֫(Landroid/graphics/Canvas;FFLandroid/graphics/Paint;)V
    .locals 10

    .line 130
    iget-object v0, p0, Ll/֫ܿ֫;->ܽ:Ll/᩺ᩳ֫;

    invoke-virtual {v0}, Ll/᩺ᩳ֫;->ܿ()Landroid/graphics/Typeface;

    move-result-object v1

    .line 131
    invoke-virtual {p4}, Landroid/graphics/Paint;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v2

    .line 132
    invoke-virtual {p4, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 137
    iget v1, p0, Ll/֫ܿ֫;->ۧ:I

    mul-int/lit8 v5, v1, 0x2

    .line 138
    invoke-virtual {v0}, Ll/᩺ᩳ֫;->֫()[C

    move-result-object v4

    const/4 v6, 0x2

    move-object v3, p1

    move v7, p2

    move v8, p3

    move-object v9, p4

    invoke-virtual/range {v3 .. v9}, Landroid/graphics/Canvas;->drawText([CIIFFLandroid/graphics/Paint;)V

    .line 139
    invoke-virtual {p4, v2}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    return-void
.end method

.method public final ֫(Z)V
    .locals 1

    .line 258
    iget v0, p0, Ll/֫ܿ֫;->֫:I

    and-int/lit8 v0, v0, 0x4

    if-eqz p1, :cond_0

    or-int/lit8 p1, v0, 0x2

    goto :goto_0

    :cond_0
    or-int/lit8 p1, v0, 0x1

    .line 264
    :goto_0
    iput p1, p0, Ll/֫ܿ֫;->֫:I

    return-void
.end method

.method public final ۜ()Z
    .locals 1

    .line 289
    iget v0, p0, Ll/֫ܿ֫;->֫:I

    and-int/lit8 v0, v0, 0x4

    if-lez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۧ()I
    .locals 1

    .line 228
    iget v0, p0, Ll/֫ܿ֫;->֫:I

    and-int/lit8 v0, v0, 0x3

    return v0
.end method

.method public final ܳ()I
    .locals 1

    .line 186
    invoke-direct {p0}, Ll/֫ܿ֫;->ۢ()Ll/᩻ܿ֫;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩻ܿ֫;->ܳ()S

    move-result v0

    return v0
.end method

.method public final ܽ()I
    .locals 1

    .line 193
    invoke-direct {p0}, Ll/֫ܿ֫;->ۢ()Ll/᩻ܿ֫;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩻ܿ֫;->ܽ()S

    move-result v0

    return v0
.end method

.method public final ܿ()S
    .locals 1

    .line 211
    invoke-direct {p0}, Ll/֫ܿ֫;->ۢ()Ll/᩻ܿ֫;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩻ܿ֫;->ܿ()S

    move-result v0

    return v0
.end method

.method public final ᩳ()I
    .locals 1

    .line 179
    invoke-direct {p0}, Ll/֫ܿ֫;->ۢ()Ll/᩻ܿ֫;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩻ܿ֫;->ᩳ()I

    move-result v0

    return v0
.end method

.method public final ᩷()V
    .locals 1

    .line 228
    iget v0, p0, Ll/֫ܿ֫;->֫:I

    and-int/lit8 v0, v0, 0x3

    or-int/lit8 v0, v0, 0x4

    .line 277
    iput v0, p0, Ll/֫ܿ֫;->֫:I

    return-void
.end method

.method public final ᩻()Z
    .locals 1

    .line 297
    invoke-direct {p0}, Ll/֫ܿ֫;->ۢ()Ll/᩻ܿ֫;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩻ܿ֫;->ۧ()Z

    move-result v0

    return v0
.end method
