.class public final Ll/֫ۢۢ;
.super Ljava/lang/Object;
.source "U9SC"


# static fields
.field public static final ܽ:Ljava/util/Set;

.field public static ܿ:I

.field public static final ᩳ:Ljava/util/ArrayList;


# instance fields
.field public ֫:Ll/᩺᩷ۢ;

.field public ۧ:Landroid/widget/ListView;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    .line 47
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Ll/֫ۢۢ;->ᩳ:Ljava/util/ArrayList;

    const/4 v0, -0x1

    .line 48
    sput v0, Ll/֫ۢۢ;->ܿ:I

    .line 51
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 52
    invoke-static {}, Ll/֨ۗ֡;->values()[Ll/֨ۗ֡;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v1, v3

    .line 53
    iget-object v4, v4, Ll/֨ۗ֡;->ۗ:Ljava/lang/String;

    invoke-virtual {v0, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 55
    :cond_0
    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Ll/֫ۢۢ;->ܽ:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Ll/ۗܺ᩷;Ljava/lang/String;)V
    .locals 12

    .line 132
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 0
    const-class v0, Ll/֫ۢۢ;

    monitor-enter v0

    .line 59
    :try_start_0
    invoke-static {}, Ll/ۙ᩸᩷;->ܿ()Landroid/app/Application;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget-object v1, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 61
    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v3

    const/16 v4, 0xc43

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eq v3, v4, :cond_6

    const/16 v4, 0xd25

    if-eq v3, v4, :cond_5

    const/16 v4, 0xe43

    if-eq v3, v4, :cond_4

    const/16 v4, 0xe7e

    if-eq v3, v4, :cond_3

    const/16 v4, 0xe96

    if-eq v3, v4, :cond_2

    const/16 v4, 0xf2e

    if-eq v3, v4, :cond_0

    goto :goto_0

    :cond_0
    const-string v3, "zh"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    const-string v2, "CN"

    .line 63
    invoke-virtual {v1}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    const/4 v1, 0x1

    goto :goto_1

    :cond_2
    const-string v1, "uk"

    .line 61
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    const/4 v1, 0x4

    goto :goto_1

    :cond_3
    const-string v1, "tr"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    const/4 v1, 0x6

    goto :goto_1

    :cond_4
    const-string v1, "ru"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    const/4 v1, 0x3

    goto :goto_1

    :cond_5
    const-string v1, "in"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    const/4 v1, 0x5

    goto :goto_1

    :cond_6
    const-string v1, "be"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    const/4 v1, 0x7

    goto :goto_1

    :cond_7
    :goto_0
    const/4 v1, 0x2

    .line 85
    :goto_1
    sget v2, Ll/֫ۢۢ;->ܿ:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    if-ne v2, v1, :cond_8

    .line 86
    monitor-exit v0

    goto/16 :goto_5

    .line 88
    :cond_8
    :try_start_1
    sget-object v2, Ll/֫ۢۢ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 89
    :try_start_2
    invoke-static {}, Ll/ۙ᩸᩷;->ۧ()Landroid/content/res/AssetManager;

    move-result-object v2

    const-string v3, "8"

    invoke-virtual {v2, v3}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v2
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 90
    :try_start_3
    new-instance v3, Ll/۬ۜܽ;

    .line 51
    invoke-static {v2, v6}, Ll/֡ۤۡ;->֫(Ljava/io/InputStream;I)[B

    move-result-object v4

    .line 90
    invoke-direct {v3, v4}, Ll/۬ۜܽ;-><init>([B)V

    const/4 v4, 0x0

    :goto_2
    if-ge v4, v1, :cond_9

    .line 217
    invoke-virtual {v3}, Ll/۬ۜܽ;->readInt()I

    move-result v7

    invoke-virtual {v3, v7}, Ll/۬ۜܽ;->skipBytes(I)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 94
    :cond_9
    invoke-virtual {v3}, Ll/۬ۜܽ;->ۜۧ()[B

    move-result-object v3

    const/4 v4, 0x0

    .line 95
    :goto_3
    array-length v7, v3

    if-ge v4, v7, :cond_a

    .line 96
    aget-byte v7, v3, v4

    not-int v7, v7

    mul-int v8, v4, v4

    xor-int/2addr v7, v8

    int-to-byte v7, v7

    aput-byte v7, v3, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    .line 98
    :cond_a
    new-instance v4, Ljava/lang/String;

    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v7

    invoke-direct {v4, v3, v7}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    const-string v3, "\n\n"

    invoke-virtual {v4, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    .line 99
    array-length v4, v3

    const/4 v7, 0x0

    :goto_4
    if-ge v7, v4, :cond_b

    aget-object v8, v3, v7

    const/16 v9, 0xa

    .line 100
    invoke-virtual {v8, v9}, Ljava/lang/String;->indexOf(I)I

    move-result v9

    .line 101
    invoke-virtual {v8, v6, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v10

    add-int/lit8 v9, v9, 0x1

    .line 102
    invoke-virtual {v8, v9}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v8

    .line 103
    sget-object v9, Ll/֫ۢۢ;->ᩳ:Ljava/util/ArrayList;

    new-instance v11, Ll/۟᩷ۢ;

    invoke-direct {v11, v10, v8}, Ll/۟᩷ۢ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v7, v7, 0x1

    goto :goto_4

    .line 105
    :cond_b
    sput v1, Ll/֫ۢۢ;->ܿ:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-eqz v2, :cond_c

    .line 106
    :try_start_4
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 109
    :cond_c
    monitor-exit v0

    :goto_5
    const v0, 0x7f0d00cd

    .line 134
    invoke-virtual {p1, v0}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0a04e6

    .line 135
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Ll/᩻ۡۡ;

    const v2, 0x7f0a0631

    .line 136
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    const v3, 0x7f0a02e0

    .line 137
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ListView;

    iput-object v3, p0, Ll/֫ۢۢ;->ۧ:Landroid/widget/ListView;

    .line 138
    new-instance v4, Ll/᩺᩷ۢ;

    invoke-direct {v4, p0}, Ll/᩺᩷ۢ;-><init>(Ll/֫ۢۢ;)V

    iput-object v4, p0, Ll/֫ۢۢ;->֫:Ll/᩺᩷ۢ;

    invoke-virtual {v3, v4}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 139
    invoke-virtual {v3, v5}, Landroid/widget/AbsListView;->setFastScrollEnabled(Z)V

    .line 140
    invoke-static {v3}, Ll/ۙ᩸ۡ;->֫(Landroid/widget/ListView;)V

    const v4, 0x7f1209af

    .line 141
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(I)V

    .line 142
    new-instance v4, Ll/ۨ᩷ۢ;

    invoke-direct {v4, p0, v2}, Ll/ۨ᩷ۢ;-><init>(Ll/֫ۢۢ;Landroid/widget/TextView;)V

    invoke-virtual {v1, v4}, Ll/᩻ۡۡ;->֫(Ll/ܿۡۡ;)V

    .line 154
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_d

    .line 155
    invoke-virtual {v1, v6}, Ll/᩻ۡۡ;->ۧ(Z)V

    .line 156
    invoke-virtual {v1, p2}, Ll/᩻ۡۡ;->֫(Ljava/lang/String;)V

    .line 157
    invoke-virtual {v3}, Landroid/view/View;->requestFocus()Z

    .line 159
    :cond_d
    sget p2, Ll/֡ۚۢ;->᩹:I

    .line 186
    new-instance p2, Ll/᩵ۚۢ;

    invoke-direct {p2, p1}, Ll/᩵ۚۢ;-><init>(Landroid/content/Context;)V

    .line 160
    invoke-virtual {p2, v0}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    const v0, 0x7f120189

    const/4 v1, 0x0

    .line 161
    invoke-virtual {p2, v0, v1}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 162
    invoke-virtual {p2}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object p2

    .line 163
    instance-of v0, p1, Ll/᩸᩶᩷;

    if-eqz v0, :cond_e

    .line 164
    new-instance v0, Ll/ۧۚۡ;

    invoke-direct {v0, p1, v5}, Ll/ۧۚۡ;-><init>(Ll/ۗܺ᩷;I)V

    invoke-virtual {p2, v0}, Ll/֡ۚۢ;->֫(Landroid/content/DialogInterface$OnDismissListener;)V

    :cond_e
    return-void

    :catchall_0
    move-exception p1

    if-eqz v2, :cond_f

    .line 89
    :try_start_5
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_6

    :catchall_1
    move-exception p2

    :try_start_6
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_f
    :goto_6
    throw p1
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :catch_0
    move-exception p1

    .line 107
    :try_start_7
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :catchall_2
    move-exception p1

    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    throw p1
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/CharSequence;I)Ljava/lang/CharSequence;
    .locals 6

    const/4 v0, 0x0

    .line 1578
    invoke-static {p0, p1, v0}, Ll/ۢܺ֡;->֫(Ljava/lang/String;Ljava/lang/CharSequence;I)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    return-object p1

    .line 277
    :cond_0
    new-instance v2, Landroid/text/SpannableString;

    invoke-direct {v2, p1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 279
    :cond_1
    new-instance v3, Landroid/text/style/StyleSpan;

    const/4 v4, 0x1

    invoke-direct {v3, v4}, Landroid/text/style/StyleSpan;-><init>(I)V

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v4, v0

    const/16 v5, 0x21

    invoke-virtual {v2, v3, v0, v4, v5}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 280
    new-instance v3, Landroid/text/style/ForegroundColorSpan;

    invoke-direct {v3, p2}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v4, v0

    invoke-virtual {v2, v3, v0, v4, v5}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 281
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    add-int/2addr v3, v0

    invoke-static {p0, p1, v3}, Ll/ۢܺ֡;->֫(Ljava/lang/String;Ljava/lang/CharSequence;I)I

    move-result v0

    if-ne v0, v1, :cond_1

    return-object v2
.end method

.method public static ֫(Ll/۫ۨᩳ;)Ljava/lang/String;
    .locals 3

    .line 112
    invoke-virtual {p0}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v0

    .line 113
    invoke-virtual {p0}, Ll/۫ۨᩳ;->۫֫()I

    move-result p0

    add-int/lit8 v1, p0, -0x1

    const/16 v2, 0xa

    .line 114
    invoke-static {v0, v2, v1}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CI)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    .line 115
    invoke-static {v0, v2, p0}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CI)I

    move-result p0

    const/4 v2, -0x1

    if-ne p0, v2, :cond_0

    .line 117
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result p0

    .line 118
    :cond_0
    invoke-interface {v0, v1, p0}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-interface {p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    const/16 v0, 0x20

    .line 119
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    if-eq v0, v2, :cond_1

    const/4 v1, 0x0

    .line 121
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    .line 123
    :cond_1
    sget-object v0, Ll/֫ۢۢ;->ܽ:Ljava/util/Set;

    invoke-interface {v0, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const/4 p0, 0x0

    :cond_2
    return-object p0
.end method

.method public static bridge synthetic ֫()Ljava/util/ArrayList;
    .locals 1

    .line 0
    sget-object v0, Ll/֫ۢۢ;->ᩳ:Ljava/util/ArrayList;

    return-object v0
.end method

.method public static bridge synthetic ֫(Ll/֫ۢۢ;)Ll/᩺᩷ۢ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֫ۢۢ;->֫:Ll/᩺᩷ۢ;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/֫ۢۢ;)Landroid/widget/ListView;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֫ۢۢ;->ۧ:Landroid/widget/ListView;

    return-object p0
.end method
