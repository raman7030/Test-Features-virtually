.class public final Ll/֡ܶ;
.super Ljava/lang/Object;
.source "V16Z"


# static fields
.field public static ܳ:I

.field public static ᩴܿ᩸:I


# instance fields
.field public ֫:I

.field public ۧ:I

.field public ܽ:I

.field public ܿ:Ljava/util/ArrayList;

.field public ᩳ:Ljava/util/ArrayList;


# direct methods
.method static native constructor <clinit>()V
.end method

.method public constructor <init>(I)V
    .locals 2

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/֡ܶ;->ܿ:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 40
    iput-object v0, p0, Ll/֡ܶ;->ᩳ:Ljava/util/ArrayList;

    const/4 v0, -0x1

    .line 41
    iput v0, p0, Ll/֡ܶ;->ۧ:I

    .line 44
    sget v0, Ll/֡ܶ;->ܳ:I

    add-int/lit8 v1, v0, 0x1

    sput v1, Ll/֡ܶ;->ܳ:I

    iput v0, p0, Ll/֡ܶ;->֫:I

    .line 45
    iput p1, p0, Ll/֡ܶ;->ܽ:I

    return-void
.end method

.method public static ֫ۢ᩵(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Ll/ᩳᩴۡ;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Ll/ᩳᩴۡ;->ۧ(Ljava/lang/String;)V

    return-void
.end method

.method public static ۘ֫ۨ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public static ۚۙ᩻(Ljava/lang/Object;Ljava/lang/Object;)Ll/ۗۛ᩻;
    .locals 0

    check-cast p0, Ljava/lang/String;

    check-cast p1, Ljava/lang/String;

    invoke-static {p0, p1}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    return-object p0
.end method

.method public static ۛܿ᩻(Ljava/lang/Object;)Z
    .locals 0

    check-cast p0, Ljava/util/Iterator;

    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p0

    return p0
.end method

.method public static ۢ֡ܶ(Ljava/lang/Object;)Z
    .locals 0

    check-cast p0, Ll/֡ۚۢ;

    invoke-virtual {p0}, Ll/֡ۚۢ;->ۜ()Z

    move-result p0

    return p0
.end method

.method public static ۢۖܶ(Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Ll/ۗܺ᩷;

    invoke-virtual {p0}, Ll/ۗܺ᩷;->ۗ()V

    return-void
.end method

.method public static ۨۙ᩷(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    check-cast p0, Ll/ۚܽۚ;

    invoke-interface {p0}, Ll/ۚܽۚ;->getName()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ܺۗܽ(ILjava/lang/Object;)I
    .locals 0

    check-cast p1, [B

    invoke-static {p0, p1}, Ll/ܺܰۡ;->֫(I[B)I

    move-result p0

    return p0
.end method

.method public static ܽ᩻᩵([SIII)Ljava/lang/String;
    .locals 3

    new-array v1, p2, [C

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p2, :cond_0

    add-int v2, p1, v0

    aget-short v2, p0, v2

    xor-int/2addr v2, p3

    int-to-char v2, v2

    aput-char v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V

    return-object v0
.end method

.method public static ܿܽۛ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/io/InputStream;
    .locals 0

    check-cast p0, Ll/᩵᩶ܿ;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Ll/᩵᩶ܿ;->᩻(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object p0

    return-object p0
.end method

.method public static ܿ᩹۠(Ljava/lang/Object;)Ll/᩵ۚۢ;
    .locals 0

    check-cast p0, Ll/۬ܺ᩷;

    invoke-interface {p0}, Ll/۬ܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object p0

    return-object p0
.end method

.method public static ᩳۛ᩺(Ljava/lang/Object;)Z
    .locals 0

    check-cast p0, Ll/᩻ᩴۡ;

    invoke-virtual {p0}, Ll/᩻ᩴۡ;->ܳ()Z

    move-result p0

    return p0
.end method

.method public static ᩵ܺ֨(Ljava/lang/Object;)Landroid/widget/EditText;
    .locals 0

    check-cast p0, Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object p0

    return-object p0
.end method

.method public static ᩵ܿᩳ(Ljava/lang/Object;Ljava/lang/Object;)[B
    .locals 0

    check-cast p0, Ljava/lang/String;

    check-cast p1, Ljava/nio/charset/Charset;

    invoke-virtual {p0, p1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    return-object p0
.end method

.method public static ᩹᩵ۚ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    check-cast p0, Ll/ܽܳ᩷;

    invoke-virtual {p0}, Ll/ܽܳ᩷;->ۖ()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ᩺᩸֡(Ljava/lang/Object;Z)V
    .locals 0

    check-cast p0, Ll/᩵ۚۢ;

    invoke-virtual {p0, p1}, Ll/᩵ۚۢ;->֫(Z)V

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 75
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 63
    iget v1, p0, Ll/֡ܶ;->ܽ:I

    if-nez v1, :cond_0

    const-string v1, "Horizontal"

    goto :goto_0

    :cond_0
    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    const-string v1, "Vertical"

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    if-ne v1, v2, :cond_2

    const-string v1, "Both"

    goto :goto_0

    :cond_2
    const-string v1, "Unknown"

    .line 75
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/֡ܶ;->֫:I

    const-string v2, "] <"

    .line 0
    invoke-static {v1, v2, v0}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    .line 76
    iget-object v1, p0, Ll/֡ܶ;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܶ۠;

    const-string v3, " "

    .line 0
    invoke-static {v0, v3}, Ll/۟֫ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 77
    invoke-virtual {v2}, Ll/ܶ۠;->ܳ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_3
    const-string v1, " >"

    .line 0
    invoke-static {v0, v1}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ܿ۠;I)I
    .locals 6

    .line 119
    iget-object v0, p0, Ll/֡ܶ;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    .line 128
    :cond_0
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܶ۠;

    .line 620
    iget-object v1, v1, Ll/ܶ۠;->ۡ֫:Ll/ܶ۠;

    .line 128
    check-cast v1, Ll/᩸۠;

    .line 129
    invoke-virtual {p1}, Ll/ܿ۠;->ܿ()V

    .line 131
    invoke-virtual {v1, p1, v2}, Ll/ܶ۠;->֫(Ll/ܿ۠;Z)V

    const/4 v3, 0x0

    .line 132
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v3, v4, :cond_1

    .line 133
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܶ۠;

    .line 134
    invoke-virtual {v4, p1, v2}, Ll/ܶ۠;->֫(Ll/ܿ۠;Z)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    if-nez p2, :cond_2

    .line 137
    iget v3, v1, Ll/᩸۠;->ܿۧ:I

    if-lez v3, :cond_2

    .line 138
    invoke-static {v1, p1, v0, v2}, Ll/ۘ۠;->֫(Ll/᩸۠;Ll/ܿ۠;Ljava/util/ArrayList;I)V

    :cond_2
    const/4 v3, 0x1

    if-ne p2, v3, :cond_3

    .line 142
    iget v4, v1, Ll/᩸۠;->ۘۧ:I

    if-lez v4, :cond_3

    .line 143
    invoke-static {v1, p1, v0, v3}, Ll/ۘ۠;->֫(Ll/᩸۠;Ll/ܿ۠;Ljava/util/ArrayList;I)V

    .line 148
    :cond_3
    :try_start_0
    invoke-virtual {p1}, Ll/ܿ۠;->ᩳ()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 154
    :catch_0
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, p0, Ll/֡ܶ;->ᩳ:Ljava/util/ArrayList;

    .line 155
    :goto_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_4

    .line 156
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܶ۠;

    .line 157
    new-instance v4, Ll/᩵ܶ;

    .line 235
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 236
    new-instance v5, Ljava/lang/ref/WeakReference;

    invoke-direct {v5, v3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 237
    iget-object v5, v3, Ll/ܶ۠;->۫:Ll/ۚ۠;

    invoke-static {v5}, Ll/ܿ۠;->ۧ(Ljava/lang/Object;)I

    .line 238
    iget-object v5, v3, Ll/ܶ۠;->᩵֫:Ll/ۚ۠;

    invoke-static {v5}, Ll/ܿ۠;->ۧ(Ljava/lang/Object;)I

    .line 239
    iget-object v5, v3, Ll/ܶ۠;->ᩴ֫:Ll/ۚ۠;

    invoke-static {v5}, Ll/ܿ۠;->ۧ(Ljava/lang/Object;)I

    .line 240
    iget-object v5, v3, Ll/ܶ۠;->ۢ:Ll/ۚ۠;

    invoke-static {v5}, Ll/ܿ۠;->ۧ(Ljava/lang/Object;)I

    .line 241
    iget-object v3, v3, Ll/ܶ۠;->ۜ:Ll/ۚ۠;

    invoke-static {v3}, Ll/ܿ۠;->ۧ(Ljava/lang/Object;)I

    .line 158
    iget-object v3, p0, Ll/֡ܶ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_4
    if-nez p2, :cond_5

    .line 162
    iget-object p2, v1, Ll/ܶ۠;->۫:Ll/ۚ۠;

    invoke-static {p2}, Ll/ܿ۠;->ۧ(Ljava/lang/Object;)I

    move-result p2

    .line 163
    iget-object v0, v1, Ll/ܶ۠;->ᩴ֫:Ll/ۚ۠;

    invoke-static {v0}, Ll/ܿ۠;->ۧ(Ljava/lang/Object;)I

    move-result v0

    .line 164
    invoke-virtual {p1}, Ll/ܿ۠;->ܿ()V

    goto :goto_2

    .line 167
    :cond_5
    iget-object p2, v1, Ll/ܶ۠;->᩵֫:Ll/ۚ۠;

    invoke-static {p2}, Ll/ܿ۠;->ۧ(Ljava/lang/Object;)I

    move-result p2

    .line 168
    iget-object v0, v1, Ll/ܶ۠;->ۢ:Ll/ۚ۠;

    invoke-static {v0}, Ll/ܿ۠;->ۧ(Ljava/lang/Object;)I

    move-result v0

    .line 169
    invoke-virtual {p1}, Ll/ܿ۠;->ܿ()V

    :goto_2
    sub-int/2addr v0, p2

    return v0
.end method

.method public final ֫(ILl/֡ܶ;)V
    .locals 3

    .line 87
    iget v0, p2, Ll/֡ܶ;->֫:I

    iget-object v1, p0, Ll/֡ܶ;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܶ۠;

    .line 88
    invoke-virtual {p2, v2}, Ll/֡ܶ;->֫(Ll/ܶ۠;)Z

    if-nez p1, :cond_0

    .line 90
    iput v0, v2, Ll/ܶ۠;->ܽ:I

    goto :goto_0

    .line 92
    :cond_0
    iput v0, v2, Ll/ܶ۠;->ۛ֫:I

    goto :goto_0

    .line 95
    :cond_1
    iput v0, p0, Ll/֡ܶ;->ۧ:I

    return-void
.end method

.method public final ֫(Ljava/util/ArrayList;)V
    .locals 5

    .line 210
    iget-object v0, p0, Ll/֡ܶ;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 211
    iget v1, p0, Ll/֡ܶ;->ۧ:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_1

    if-lez v0, :cond_1

    const/4 v1, 0x0

    .line 212
    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 213
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֡ܶ;

    .line 214
    iget v3, p0, Ll/֡ܶ;->ۧ:I

    iget v4, v2, Ll/֡ܶ;->֫:I

    if-ne v3, v4, :cond_0

    .line 215
    iget v3, p0, Ll/֡ܶ;->ܽ:I

    invoke-virtual {p0, v3, v2}, Ll/֡ܶ;->֫(ILl/֡ܶ;)V

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    if-nez v0, :cond_2

    .line 220
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_2
    return-void
.end method

.method public final ֫(Ll/ܶ۠;)Z
    .locals 2

    .line 52
    iget-object v0, p0, Ll/֡ܶ;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 55
    :cond_0
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    return p1
.end method
