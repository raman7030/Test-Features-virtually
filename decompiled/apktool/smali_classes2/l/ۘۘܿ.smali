.class public final Ll/ۘۘܿ;
.super Ljava/lang/Object;
.source "Q983"


# static fields
.field public static final synthetic ֫:I

.field public static final ۧ:J

.field public static final ܽ:Ljava/util/WeakHashMap;

.field public static final ᩳ:J


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 25
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x5dc

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v1

    sput-wide v1, Ll/ۘۘܿ;->ᩳ:J

    const-wide/16 v1, 0x32

    .line 26
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    sput-wide v0, Ll/ۘۘܿ;->ۧ:J

    .line 28
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    sput-object v0, Ll/ۘۘܿ;->ܽ:Ljava/util/WeakHashMap;

    return-void
.end method

.method public static ֫(Ljava/lang/String;)Ljava/lang/CharSequence;
    .locals 8

    const-string v0, "INTERNAL:ArscTranslationItem"

    const/16 v1, 0xc8

    .line 239
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    invoke-static {v2, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    const/4 v2, 0x0

    .line 245
    invoke-virtual {p0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    .line 58
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    const/16 v4, 0x2000

    if-le v3, v4, :cond_0

    goto :goto_3

    .line 253
    :cond_0
    invoke-static {v0}, Ll/ۜ᩷ܿ;->ܿ(Ljava/lang/String;)Ll/ܶۜܿ;

    move-result-object v3

    const/4 v4, 0x0

    if-nez v3, :cond_1

    goto :goto_1

    .line 269
    :cond_1
    :try_start_0
    sget-object v5, Ll/ۘۘܿ;->ܽ:Ljava/util/WeakHashMap;

    move-object v0, v5

    monitor-enter v0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 270
    :try_start_1
    invoke-virtual {v5, v3}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/ref/WeakReference;

    if-nez v6, :cond_2

    move-object v6, v4

    goto :goto_0

    .line 271
    :cond_2
    invoke-virtual {v6}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩺ܺܿ;

    :goto_0
    if-eqz v6, :cond_3

    .line 272
    invoke-virtual {v6}, Ll/᩺ܺܿ;->ܽ()Z

    move-result v7

    if-nez v7, :cond_4

    .line 273
    :cond_3
    invoke-static {v3}, Ll/᩺ܺܿ;->ۧ(Ll/ܶۜܿ;)Ll/᩺ܺܿ;

    move-result-object v6

    .line 274
    new-instance v7, Ljava/lang/ref/WeakReference;

    invoke-direct {v7, v6}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v5, v3, v7}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 276
    :cond_4
    monitor-exit v0

    move-object v4, v6

    goto :goto_1

    :catchall_0
    move-exception v3

    .line 277
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v3
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    nop

    :goto_1
    if-eqz v4, :cond_8

    .line 62
    invoke-virtual {v4}, Ll/᩺ܺܿ;->᩻()Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_3

    .line 65
    :cond_5
    sget-wide v5, Ll/ۘۘܿ;->ۧ:J

    .line 224
    invoke-static {v4, p0, v1, v5, v6}, Ll/ۘۘܿ;->֫(Ll/᩺ܺܿ;Ljava/lang/CharSequence;IJ)Ll/ۢۖܿ;

    move-result-object p0

    if-nez p0, :cond_6

    goto :goto_3

    .line 228
    :cond_6
    instance-of v0, v2, Landroid/text/Spannable;

    if-eqz v0, :cond_7

    check-cast v2, Landroid/text/Spannable;

    goto :goto_2

    .line 229
    :cond_7
    new-instance v0, Landroid/text/SpannableString;

    invoke-direct {v0, v2}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    move-object v2, v0

    .line 230
    :goto_2
    invoke-static {v2, p0}, Ll/ۘۘܿ;->֫(Landroid/text/Spannable;Ll/ۢۖܿ;)V

    :cond_8
    :goto_3
    return-object v2
.end method

.method public static ֫(Ll/᩺ܺܿ;Ljava/lang/CharSequence;IJ)Ll/ۢۖܿ;
    .locals 3

    .line 174
    instance-of v0, p1, Ll/᩶᩸ᩳ;

    if-eqz v0, :cond_0

    check-cast p1, Ll/᩶᩸ᩳ;

    .line 175
    invoke-interface {p1}, Ll/᩶᩸ᩳ;->ۖ֫()Ll/۟᩸ᩳ;

    move-result-object p1

    .line 176
    :try_start_0
    invoke-static {p0, p1, p2, p3, p4}, Ll/ۘۘܿ;->֫(Ll/᩺ܺܿ;Ljava/lang/CharSequence;IJ)Ll/ۢۖܿ;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 177
    invoke-virtual {p1}, Ll/۟᩸ᩳ;->close()V

    return-object p0

    :catchall_0
    move-exception p0

    .line 175
    :try_start_1
    invoke-virtual {p1}, Ll/۟᩸ᩳ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p1

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p0

    :cond_0
    if-ltz p2, :cond_3

    .line 239
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    .line 180
    invoke-virtual {p0}, Ll/᩺ܺܿ;->᩻()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    return-object v1

    .line 183
    :cond_1
    new-instance v0, Ll/ۢۘܿ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 253
    new-instance v2, Ll/ۗۢܿ;

    .line 254
    invoke-direct {v2, p0, p1, v0, p2}, Ll/ۗۢܿ;-><init>(Ll/᩺ܺܿ;Ljava/lang/CharSequence;Ll/ۢۘܿ;I)V

    const p0, 0x7fffffff

    .line 432
    :try_start_2
    invoke-virtual {v2, p0, p3, p4, v1}, Ll/ۗۢܿ;->֫(IJLl/᩺᩷ܿ;)Ll/ۙۢܿ;

    move-result-object p0

    .line 193
    sget-object p1, Ll/ۙۢܿ;->᩶:Ll/ۙۢܿ;

    if-ne p0, p1, :cond_2

    invoke-virtual {v2}, Ll/ۗۢܿ;->᩻()Ll/ۢۖܿ;

    move-result-object p0
    :try_end_2
    .catch Ll/۠ۢܿ; {:try_start_2 .. :try_end_2} :catch_0

    return-object p0

    :catch_0
    :cond_2
    return-object v1

    .line 237
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Negative syntax highlight prefix length"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ll/᩺ܺܿ;Ljava/lang/CharSequence;J)Ll/ۢۖܿ;
    .locals 3

    .line 161
    instance-of v0, p1, Ll/᩶᩸ᩳ;

    if-eqz v0, :cond_0

    check-cast p1, Ll/᩶᩸ᩳ;

    .line 162
    invoke-interface {p1}, Ll/᩶᩸ᩳ;->ۖ֫()Ll/۟᩸ᩳ;

    move-result-object p1

    .line 163
    :try_start_0
    invoke-static {p0, p1, p2, p3}, Ll/ۘۘܿ;->֫(Ll/᩺ܺܿ;Ljava/lang/CharSequence;J)Ll/ۢۖܿ;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 164
    invoke-virtual {p1}, Ll/۟᩸ᩳ;->close()V

    return-object p0

    :catchall_0
    move-exception p0

    .line 162
    :try_start_1
    invoke-virtual {p1}, Ll/۟᩸ᩳ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p1

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p0

    .line 166
    :cond_0
    new-instance v0, Ll/ۢۘܿ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 205
    new-instance v1, Ll/ۗۢܿ;

    const-string v2, "text"

    invoke-static {p1, v2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 206
    invoke-direct {v1, p0, p1, v0}, Ll/ۗۢܿ;-><init>(Ll/᩺ܺܿ;Ljava/lang/CharSequence;Ll/ۢۘܿ;)V

    const p0, 0x7fffffff

    const/4 p1, 0x0

    .line 432
    :try_start_2
    invoke-virtual {v1, p0, p2, p3, p1}, Ll/ۗۢܿ;->֫(IJLl/᩺᩷ܿ;)Ll/ۙۢܿ;

    move-result-object p0

    .line 193
    sget-object p2, Ll/ۙۢܿ;->᩶:Ll/ۙۢܿ;

    if-ne p0, p2, :cond_1

    invoke-virtual {v1}, Ll/ۗۢܿ;->᩻()Ll/ۢۖܿ;

    move-result-object p0
    :try_end_2
    .catch Ll/۠ۢܿ; {:try_start_2 .. :try_end_2} :catch_0

    return-object p0

    :catch_0
    :cond_1
    return-object p1
.end method

.method public static ֫(Landroid/text/Spannable;)V
    .locals 4

    .line 128
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const-class v1, Ll/ۖۘܿ;

    const/4 v2, 0x0

    .line 127
    invoke-interface {p0, v2, v0, v1}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/ۖۘܿ;

    .line 129
    array-length v1, v0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    .line 130
    invoke-interface {p0, v3}, Landroid/text/Spannable;->removeSpan(Ljava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static ֫(Landroid/text/Spannable;Ll/ۢۖܿ;)V
    .locals 4

    .line 201
    invoke-virtual {p1}, Ll/ۢۖܿ;->֫()I

    move-result v0

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-ne v0, v1, :cond_1

    .line 204
    invoke-static {p0}, Ll/ۘۘܿ;->֫(Landroid/text/Spannable;)V

    .line 143
    new-instance v0, Ll/ᩳۖܿ;

    invoke-direct {v0}, Ll/ᩳۖܿ;-><init>()V

    invoke-virtual {v0, p1}, Ll/ᩳۖܿ;->֫(Ll/ۢۖܿ;)V

    .line 206
    :goto_0
    invoke-virtual {v0}, Ll/ᩳۖܿ;->ܿ()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 207
    invoke-virtual {v0}, Ll/ᩳۖܿ;->ܽ()Ll/᩸᩷ܿ;

    move-result-object p1

    .line 208
    new-instance v1, Ll/ۖۘܿ;

    .line 209
    invoke-virtual {p1}, Ll/᩸᩷ܿ;->ۖ()I

    move-result v2

    invoke-virtual {p1}, Ll/᩸᩷ܿ;->ۜ()I

    move-result p1

    invoke-direct {v1, v2, p1}, Ll/ۖۘܿ;-><init>(II)V

    .line 210
    invoke-virtual {v0}, Ll/ᩳۖܿ;->ۧ()I

    move-result p1

    invoke-virtual {v0}, Ll/ᩳۖܿ;->֫()I

    move-result v2

    const/16 v3, 0x11

    invoke-interface {p0, v1, p1, v2, v3}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    goto :goto_0

    :cond_0
    return-void

    .line 202
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Syntax store and text lengths differ"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Landroid/widget/EditText;Landroid/widget/CheckBox;)V
    .locals 6

    const-string v0, "INTERNAL:Regex"

    .line 253
    invoke-static {v0}, Ll/ۜ᩷ܿ;->ܿ(Ljava/lang/String;)Ll/ܶۜܿ;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    goto :goto_1

    .line 269
    :cond_0
    :try_start_0
    sget-object v3, Ll/ۘۘܿ;->ܽ:Ljava/util/WeakHashMap;

    move-object v0, v3

    monitor-enter v0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 270
    :try_start_1
    invoke-virtual {v3, v1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/ref/WeakReference;

    if-nez v4, :cond_1

    move-object v4, v2

    goto :goto_0

    .line 271
    :cond_1
    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩺ܺܿ;

    :goto_0
    if-eqz v4, :cond_2

    .line 272
    invoke-virtual {v4}, Ll/᩺ܺܿ;->ܽ()Z

    move-result v5

    if-nez v5, :cond_3

    .line 273
    :cond_2
    invoke-static {v1}, Ll/᩺ܺܿ;->ۧ(Ll/ܶۜܿ;)Ll/᩺ܺܿ;

    move-result-object v4

    .line 274
    new-instance v5, Ljava/lang/ref/WeakReference;

    invoke-direct {v5, v4}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v3, v1, v5}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 276
    :cond_3
    monitor-exit v0

    move-object v2, v4

    goto :goto_1

    :catchall_0
    move-exception v1

    .line 277
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v1
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    nop

    :goto_1
    if-nez v2, :cond_4

    goto :goto_3

    .line 74
    :cond_4
    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    .line 76
    instance-of v1, v0, Landroid/text/Spannable;

    if-eqz v1, :cond_5

    check-cast v0, Landroid/text/Spannable;

    goto :goto_2

    .line 79
    :cond_5
    new-instance v1, Landroid/text/SpannableString;

    invoke-direct {v1, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 80
    invoke-virtual {p0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    move-object v0, v1

    :goto_2
    if-eqz p1, :cond_6

    .line 82
    invoke-virtual {p1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v1

    if-eqz v1, :cond_7

    .line 83
    :cond_6
    invoke-static {v2, v0}, Ll/ۘۘܿ;->֫(Ll/᩺ܺܿ;Landroid/text/Spannable;)V

    .line 85
    :cond_7
    new-instance v0, Ll/ܺۘܿ;

    invoke-direct {v0, p1, v2}, Ll/ܺۘܿ;-><init>(Landroid/widget/CompoundButton;Ll/᩺ܺܿ;)V

    invoke-virtual {p0, v0}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    if-eqz p1, :cond_8

    .line 104
    new-instance v0, Ll/ۡۘܿ;

    invoke-direct {v0, p0, v2}, Ll/ۡۘܿ;-><init>(Landroid/widget/TextView;Ll/᩺ܺܿ;)V

    invoke-virtual {p1, v0}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    :cond_8
    :goto_3
    return-void
.end method

.method public static synthetic ֫(Landroid/widget/TextView;Ll/᩺ܺܿ;Z)V
    .locals 1

    .line 105
    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p0

    instance-of v0, p0, Landroid/text/Spannable;

    if-eqz v0, :cond_1

    check-cast p0, Landroid/text/Spannable;

    if-eqz p2, :cond_0

    .line 107
    invoke-static {p1, p0}, Ll/ۘۘܿ;->֫(Ll/᩺ܺܿ;Landroid/text/Spannable;)V

    return-void

    .line 109
    :cond_0
    invoke-static {p0}, Ll/ۘۘܿ;->֫(Landroid/text/Spannable;)V

    :cond_1
    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩺ܺܿ;Landroid/text/Editable;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۘۘܿ;->֫(Ll/᩺ܺܿ;Landroid/text/Spannable;)V

    return-void
.end method

.method public static ֫(Ll/᩺ܺܿ;Landroid/text/Spannable;)V
    .locals 2

    .line 118
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/16 v1, 0x2000

    if-le v0, v1, :cond_0

    .line 119
    invoke-static {p1}, Ll/ۘۘܿ;->֫(Landroid/text/Spannable;)V

    return-void

    .line 136
    :cond_0
    sget-wide v0, Ll/ۘۘܿ;->ᩳ:J

    .line 142
    invoke-static {p0, p1, v0, v1}, Ll/ۘۘܿ;->֫(Ll/᩺ܺܿ;Ljava/lang/CharSequence;J)Ll/ۢۖܿ;

    move-result-object p0

    if-eqz p0, :cond_1

    .line 144
    invoke-static {p1, p0}, Ll/ۘۘܿ;->֫(Landroid/text/Spannable;Ll/ۢۖܿ;)V

    :cond_1
    return-void
.end method
