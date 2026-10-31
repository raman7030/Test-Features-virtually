.class public Ll/ۛۙ᩷;
.super Ll/ۘۙ᩷;
.source "8AHX"


# instance fields
.field public ۛ֫:Ll/ۛ᩵᩷;

.field public ۤ֫:I

.field public final ۫֫:Ll/ۤۙ᩷;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 44
    invoke-direct {p0, p1}, Ll/ۘۙ᩷;-><init>(Landroid/content/Context;)V

    .line 40
    new-instance p1, Ll/ۤۙ᩷;

    .line 271
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-object p1, p0, Ll/ۛۙ᩷;->۫֫:Ll/ۤۙ᩷;

    const/4 p1, 0x0

    .line 45
    invoke-direct {p0, p1}, Ll/ۛۙ᩷;->֫(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 49
    invoke-direct {p0, p1, p2}, Ll/ۘۙ᩷;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 40
    new-instance p1, Ll/ۤۙ᩷;

    .line 271
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-object p1, p0, Ll/ۛۙ᩷;->۫֫:Ll/ۤۙ᩷;

    .line 50
    invoke-direct {p0, p2}, Ll/ۛۙ᩷;->֫(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 54
    invoke-direct {p0, p1, p2, p3}, Ll/ۘۙ᩷;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 40
    new-instance p1, Ll/ۤۙ᩷;

    .line 271
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-object p1, p0, Ll/ۛۙ᩷;->۫֫:Ll/ۤۙ᩷;

    .line 55
    invoke-direct {p0, p2}, Ll/ۛۙ᩷;->֫(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    .line 59
    invoke-direct {p0, p1, p2, p3, p4}, Ll/ۘۙ᩷;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 40
    new-instance p1, Ll/ۤۙ᩷;

    .line 271
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-object p1, p0, Ll/ۛۙ᩷;->۫֫:Ll/ۤۙ᩷;

    .line 60
    invoke-direct {p0, p2}, Ll/ۛۙ᩷;->֫(Landroid/util/AttributeSet;)V

    return-void
.end method

.method private ֫(Landroid/content/SharedPreferences;Ljava/lang/String;)V
    .locals 6

    .line 154
    invoke-virtual {p0}, Ll/֫᩸ۧ;->֫()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iget v1, p0, Ll/ۛۙ᩷;->ۤ֫:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v0

    .line 155
    array-length v1, v0

    if-nez v1, :cond_0

    const v0, 0x7f120aa3

    .line 156
    invoke-static {v0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    .line 185
    :cond_0
    array-length v1, v0

    const/4 v2, 0x1

    add-int/2addr v1, v2

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/String;

    iget-object v3, p0, Ll/ۛۙ᩷;->۫֫:Ll/ۤۙ᩷;

    iput-object v1, v3, Ll/ۤۙ᩷;->֫:[Ljava/lang/String;

    .line 186
    array-length v0, v0

    iput v0, v3, Ll/ۤۙ᩷;->ܽ:I

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 166
    :try_start_0
    invoke-interface {p1, p2, v0}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v4
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 169
    :catch_0
    :try_start_1
    invoke-interface {p1, p2, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 170
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    .line 171
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v5

    invoke-interface {v5, p2, v4}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v5

    invoke-interface {v5}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    .line 174
    :catch_1
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v4

    invoke-interface {v4, p2}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v4

    invoke-interface {v4}, Landroid/content/SharedPreferences$Editor;->apply()V

    const/4 v4, 0x0

    .line 187
    :goto_0
    iput v4, v3, Ll/ۤۙ᩷;->ۜ:I

    .line 188
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "_custom"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {p1, v4, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, v3, Ll/ۤۙ᩷;->ܿ:Ljava/lang/String;

    .line 189
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "_custom_md5"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {p1, v4, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, v3, Ll/ۤۙ᩷;->ᩳ:Ljava/lang/String;

    .line 190
    sget-object p1, Ll/ܽ֡ܿ;->ܿ:Ll/ܶ᩵ܿ;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "_custom.dat"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v4}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v4

    iput-object v4, v3, Ll/ۤۙ᩷;->ۧ:Ll/ܶ᩵ܿ;

    .line 191
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "_custom.dat.tmp"

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p1

    iput-object p1, v3, Ll/ۤۙ᩷;->᩷:Ll/ܶ᩵ܿ;

    .line 192
    iput-boolean v0, v3, Ll/ۤۙ᩷;->᩻:Z

    .line 283
    iget-object p1, v3, Ll/ۤۙ᩷;->ܿ:Ljava/lang/String;

    if-eqz p1, :cond_2

    .line 284
    iget-object p1, v3, Ll/ۤۙ᩷;->ᩳ:Ljava/lang/String;

    if-eqz p1, :cond_1

    iget-object p1, v3, Ll/ۤۙ᩷;->ۧ:Ll/ܶ᩵ܿ;

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result p1

    if-nez p1, :cond_2

    .line 285
    :cond_1
    iput-object v1, v3, Ll/ۤۙ᩷;->ܿ:Ljava/lang/String;

    .line 286
    iput-object v1, v3, Ll/ۤۙ᩷;->ᩳ:Ljava/lang/String;

    .line 289
    :cond_2
    iget-object p1, v3, Ll/ۤۙ᩷;->ܿ:Ljava/lang/String;

    if-nez p1, :cond_3

    iget-object p1, v3, Ll/ۤۙ᩷;->ۧ:Ll/ܶ᩵ܿ;

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 290
    iget-object p1, v3, Ll/ۤۙ᩷;->ۧ:Ll/ܶ᩵ܿ;

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->۫()Z

    .line 292
    :cond_3
    iget p1, v3, Ll/ۤۙ᩷;->ۜ:I

    if-ltz p1, :cond_4

    iget p2, v3, Ll/ۤۙ᩷;->ܽ:I

    if-le p1, p2, :cond_5

    .line 293
    :cond_4
    iput v0, v3, Ll/ۤۙ᩷;->ۜ:I

    .line 295
    :cond_5
    iget-object p1, v3, Ll/ۤۙ᩷;->ܿ:Ljava/lang/String;

    if-nez p1, :cond_6

    iget p2, v3, Ll/ۤۙ᩷;->ۜ:I

    iget v1, v3, Ll/ۤۙ᩷;->ܽ:I

    if-ne p2, v1, :cond_6

    .line 296
    iput v0, v3, Ll/ۤۙ᩷;->ۜ:I

    .line 194
    :cond_6
    iget-object p2, v3, Ll/ۤۙ᩷;->֫:[Ljava/lang/String;

    iget v1, v3, Ll/ۤۙ᩷;->ܽ:I

    if-eqz p1, :cond_7

    goto :goto_1

    :cond_7
    const p1, 0x7f1206ff

    .line 301
    invoke-static {p1}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p1

    :goto_1
    new-array v2, v2, [Ljava/lang/Object;

    aput-object p1, v2, v0

    const p1, 0x7f120215

    invoke-static {p1, v2}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 194
    aput-object p1, p2, v1

    return-void
.end method

.method private ֫(Landroid/util/AttributeSet;)V
    .locals 3

    const v0, 0x7f030025

    if-nez p1, :cond_0

    goto :goto_0

    .line 142
    :cond_0
    invoke-virtual {p0}, Ll/֫᩸ۧ;->֫()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Ll/᩵᩸᩷;->ۧ:[I

    invoke-virtual {v1, p1, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    const/4 v1, 0x0

    .line 144
    :try_start_0
    invoke-virtual {p1, v1, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 146
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 64
    :goto_0
    iput v0, p0, Ll/ۛۙ᩷;->ۤ֫:I

    .line 65
    invoke-virtual {p0}, Ll/֫᩸ۧ;->֫()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Ll/ۚ۫ۡ;->֫(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object p1

    check-cast p1, Ll/ۗܺ᩷;

    .line 66
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    new-instance v0, Ll/ᩴۗ᩻;

    invoke-direct {v0, p0, p1}, Ll/ᩴۗ᩻;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p1, v0}, Ll/᩵֡᩷;->֫(Ll/ۗܺ᩷;Ll/᩺᩵᩷;)Ll/ۛ᩵᩷;

    move-result-object p1

    iput-object p1, p0, Ll/ۛۙ᩷;->ۛ֫:Ll/ۛ᩵᩷;

    return-void

    :catchall_0
    move-exception v0

    .line 146
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 147
    throw v0
.end method

.method public static ֫(Ll/ۛۙ᩷;)V
    .locals 1

    .line 234
    iget-object p0, p0, Ll/ۛۙ᩷;->۫֫:Ll/ۤۙ᩷;

    .line 315
    iget-boolean v0, p0, Ll/ۤۙ᩷;->᩻:Z

    if-eqz v0, :cond_0

    .line 316
    iget-object v0, p0, Ll/ۤۙ᩷;->᩷:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۫()Z

    const/4 v0, 0x0

    .line 317
    iput-boolean v0, p0, Ll/ۤۙ᩷;->᩻:Z

    :cond_0
    return-void
.end method

.method public static synthetic ֫(Ll/ۛۙ᩷;I)V
    .locals 0

    .line 228
    iget-object p0, p0, Ll/ۛۙ᩷;->۫֫:Ll/ۤۙ᩷;

    iput p1, p0, Ll/ۤۙ᩷;->ۜ:I

    .line 229
    invoke-virtual {p0}, Ll/ۤۙ᩷;->֫()V

    return-void
.end method

.method public static ֫(Ll/ۛۙ᩷;Ll/ۗܺ᩷;Landroid/content/SharedPreferences;Ljava/lang/String;)V
    .locals 4

    .line 245
    iget-object v0, p0, Ll/ۛۙ᩷;->۫֫:Ll/ۤۙ᩷;

    iget v1, v0, Ll/ۤۙ᩷;->ۜ:I

    iget v2, v0, Ll/ۤۙ᩷;->ܽ:I

    const/4 v3, 0x0

    if-ne v1, v2, :cond_2

    .line 246
    iget-object v1, v0, Ll/ۤۙ᩷;->ܿ:Ljava/lang/String;

    if-nez v1, :cond_0

    .line 247
    iget-object p0, v0, Ll/ۤۙ᩷;->ܳ:Ll/֡ۚۢ;

    invoke-virtual {p0}, Ll/֡ۚۢ;->ܿ()Landroid/widget/Button;

    move-result-object p0

    invoke-virtual {p0, v3}, Landroid/view/View;->setEnabled(Z)V

    return-void

    .line 250
    :cond_0
    iget-boolean v1, v0, Ll/ۤۙ᩷;->᩻:Z

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    .line 252
    :try_start_0
    iget-object v2, v0, Ll/ۤۙ᩷;->᩷:Ll/ܶ᩵ܿ;

    iget-object v3, v0, Ll/ۤۙ᩷;->ۧ:Ll/ܶ᩵ܿ;

    .line 991
    invoke-virtual {v2, v3, v1}, Ll/ܶ᩵ܿ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    .line 546
    invoke-virtual {p1, p0, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void

    .line 258
    :cond_1
    :goto_0
    invoke-interface {p2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    iget p2, v0, Ll/ۤۙ᩷;->ۜ:I

    invoke-interface {p1, p3, p2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    const-string p2, "_custom"

    .line 0
    invoke-static {p3, p2}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 258
    iget-object v1, v0, Ll/ۤۙ᩷;->ܿ:Ljava/lang/String;

    .line 259
    invoke-interface {p1, p2, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    const-string p2, "_custom_md5"

    .line 0
    invoke-static {p3, p2}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 259
    iget-object p3, v0, Ll/ۤۙ᩷;->ᩳ:Ljava/lang/String;

    .line 260
    invoke-interface {p1, p2, p3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    .line 261
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    goto :goto_1

    .line 315
    :cond_2
    iget-boolean p1, v0, Ll/ۤۙ᩷;->᩻:Z

    if-eqz p1, :cond_3

    .line 316
    iget-object p1, v0, Ll/ۤۙ᩷;->᩷:Ll/ܶ᩵ܿ;

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->۫()Z

    .line 317
    iput-boolean v3, v0, Ll/ۤۙ᩷;->᩻:Z

    .line 264
    :cond_3
    invoke-interface {p2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    iget p2, v0, Ll/ۤۙ᩷;->ۜ:I

    invoke-interface {p1, p3, p2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 266
    :goto_1
    iget-object p1, v0, Ll/ۤۙ᩷;->֫:[Ljava/lang/String;

    iget p2, v0, Ll/ۤۙ᩷;->ۜ:I

    aget-object p1, p1, p2

    invoke-virtual {p0, p1}, Ll/֫᩸ۧ;->֫(Ljava/lang/CharSequence;)V

    .line 267
    iget-object p0, v0, Ll/ۤۙ᩷;->ܳ:Ll/֡ۚۢ;

    invoke-virtual {p0}, Ll/֡ۚۢ;->dismiss()V

    return-void
.end method

.method public static synthetic ֫(Ll/ۛۙ᩷;Ll/ۗܺ᩷;Ljava/lang/String;)V
    .locals 4

    .line 68
    iget-object v0, p0, Ll/ۛۙ᩷;->۫֫:Ll/ۤۙ᩷;

    iget-object v0, v0, Ll/ۤۙ᩷;->ܳ:Ll/֡ۚۢ;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    .line 71
    invoke-static {p2, v0}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 72
    sget-object v1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {v1}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object v1

    const-string v2, "ffpp"

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->getParent()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ll/۬ۤۡ;->putString(Ljava/lang/String;Ljava/lang/String;)Ll/۬ۤۡ;

    move-result-object v1

    invoke-interface {v1}, Ll/۬ۤۡ;->apply()V

    .line 73
    new-instance v1, Ll/۫ۙ᩷;

    invoke-direct {v1, p0, p1, v0, p2}, Ll/۫ۙ᩷;-><init>(Ll/ۛۙ᩷;Ll/ۗܺ᩷;Ll/ܶ᩵ܿ;Ljava/lang/String;)V

    .line 131
    invoke-virtual {v1}, Ll/۟ܶۡ;->᩻()V

    return-void
.end method

.method public static ۧ(Ll/ۛۙ᩷;)V
    .locals 1

    .line 232
    iget-object p0, p0, Ll/ۛۙ᩷;->۫֫:Ll/ۤۙ᩷;

    .line 315
    iget-boolean v0, p0, Ll/ۤۙ᩷;->᩻:Z

    if-eqz v0, :cond_0

    .line 316
    iget-object v0, p0, Ll/ۤۙ᩷;->᩷:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۫()Z

    const/4 v0, 0x0

    .line 317
    iput-boolean v0, p0, Ll/ۤۙ᩷;->᩻:Z

    :cond_0
    return-void
.end method

.method public static ܽ(Ll/ۛۙ᩷;)V
    .locals 5

    .line 238
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "ffpp"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Ll/۫ۤۡ;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 239
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 240
    sget-object v0, Ll/ܽ֡ܿ;->᩻:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    .line 242
    :cond_0
    iget-object p0, p0, Ll/ۛۙ᩷;->ۛ֫:Ll/ۛ᩵᩷;

    const-string v1, "otf"

    const-string v2, "woff"

    const-string v3, "ttf"

    const-string v4, "ttc"

    filled-new-array {v3, v4, v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v2, 0x8

    const v3, 0x7f120216

    .line 0
    invoke-static {p0, v3, v0, v1, v2}, Ll/ۛ᩵᩷;->֫(Ll/ۛ᩵᩷;ILjava/lang/String;[Ljava/lang/String;I)V

    return-void
.end method

.method public static bridge synthetic ᩳ(Ll/ۛۙ᩷;)Ll/ۤۙ᩷;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۛۙ᩷;->۫֫:Ll/ۤۙ᩷;

    return-object p0
.end method


# virtual methods
.method public final ֫(Ll/ۗܺ᩷;)V
    .locals 8

    .line 222
    invoke-virtual {p0}, Ll/ۘۙ᩷;->ۜ֫()Landroid/content/SharedPreferences;

    move-result-object v0

    .line 223
    invoke-virtual {p0}, Ll/֫᩸ۧ;->ۢ()Ljava/lang/String;

    move-result-object v1

    .line 224
    invoke-direct {p0, v0, v1}, Ll/ۛۙ᩷;->֫(Landroid/content/SharedPreferences;Ljava/lang/String;)V

    .line 225
    invoke-virtual {p1}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v2

    .line 226
    invoke-virtual {p0}, Ll/֫᩸ۧ;->۠()Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v2, v3}, Ll/᩵ۚۢ;->ۧ(Ljava/lang/CharSequence;)V

    iget-object v3, p0, Ll/ۛۙ᩷;->۫֫:Ll/ۤۙ᩷;

    iget-object v4, v3, Ll/ۤۙ᩷;->֫:[Ljava/lang/String;

    iget v5, v3, Ll/ۤۙ᩷;->ۜ:I

    new-instance v6, Ll/᩷۫᩷;

    const/4 v7, 0x3

    invoke-direct {v6, v7, p0}, Ll/᩷۫᩷;-><init>(ILjava/lang/Object;)V

    .line 227
    invoke-virtual {v2, v4, v5, v6}, Ll/᩵ۚۢ;->֫([Ljava/lang/CharSequence;ILandroid/content/DialogInterface$OnClickListener;)V

    const v4, 0x7f12070a

    const/4 v5, 0x0

    .line 231
    invoke-virtual {v2, v4, v5}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    new-instance v4, Ll/ۢ۫᩷;

    const/4 v6, 0x2

    invoke-direct {v4, v6, p0}, Ll/ۢ۫᩷;-><init>(ILjava/lang/Object;)V

    const v6, 0x7f12015e

    .line 232
    invoke-virtual {v2, v6, v4}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    const v4, 0x7f12092b

    .line 233
    invoke-virtual {v2, v4, v5}, Ll/᩵ۚۢ;->ܽ(ILandroid/content/DialogInterface$OnClickListener;)V

    new-instance v4, Ll/᩶ۙ᩷;

    invoke-direct {v4, p0}, Ll/᩶ۙ᩷;-><init>(Ll/ۛۙ᩷;)V

    .line 234
    invoke-virtual {v2, v4}, Ll/᩵ۚۢ;->֫(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 235
    invoke-virtual {v2}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object v2

    iput-object v2, v3, Ll/ۤۙ᩷;->ܳ:Ll/֡ۚۢ;

    .line 236
    invoke-virtual {v3}, Ll/ۤۙ᩷;->֫()V

    .line 237
    iget-object v2, v3, Ll/ۤۙ᩷;->ܳ:Ll/֡ۚۢ;

    invoke-virtual {v2}, Ll/֡ۚۢ;->ᩳ()Landroid/widget/Button;

    move-result-object v2

    new-instance v4, Ll/ۙۙ᩷;

    const/4 v5, 0x0

    invoke-direct {v4, v5, p0}, Ll/ۙۙ᩷;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v2, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 244
    iget-object v2, v3, Ll/ۤۙ᩷;->ܳ:Ll/֡ۚۢ;

    invoke-virtual {v2}, Ll/֡ۚۢ;->ܿ()Landroid/widget/Button;

    move-result-object v2

    new-instance v3, Ll/ۗۙ᩷;

    invoke-direct {v3, p0, p1, v0, v1}, Ll/ۗۙ᩷;-><init>(Ll/ۛۙ᩷;Ll/ۗܺ᩷;Landroid/content/SharedPreferences;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final ۤ()V
    .locals 2

    .line 213
    invoke-super {p0}, Ll/֫᩸ۧ;->ۤ()V

    .line 214
    invoke-virtual {p0}, Ll/ۘۙ᩷;->ۜ֫()Landroid/content/SharedPreferences;

    move-result-object v0

    .line 215
    invoke-virtual {p0}, Ll/֫᩸ۧ;->ۢ()Ljava/lang/String;

    move-result-object v1

    .line 216
    invoke-direct {p0, v0, v1}, Ll/ۛۙ᩷;->֫(Landroid/content/SharedPreferences;Ljava/lang/String;)V

    .line 217
    iget-object v0, p0, Ll/ۛۙ᩷;->۫֫:Ll/ۤۙ᩷;

    iget-object v1, v0, Ll/ۤۙ᩷;->֫:[Ljava/lang/String;

    iget v0, v0, Ll/ۤۙ᩷;->ۜ:I

    aget-object v0, v1, v0

    invoke-virtual {p0, v0}, Ll/֫᩸ۧ;->֫(Ljava/lang/CharSequence;)V

    return-void
.end method
