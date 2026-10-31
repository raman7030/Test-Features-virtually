.class public abstract Ll/ۗ᩻᩻;
.super Ljava/lang/Object;
.source "5AG9"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field public ۗ:J

.field public ۙ:Ljava/lang/String;

.field public ۛ:Z

.field public ۟:Z

.field public ۤ:I

.field public ۨ:Z

.field public ۫:Z

.field public ۬:Ljava/lang/String;

.field public ܰ:Ljava/util/HashMap;

.field public final ᩶:I

.field public ᩸:Z

.field public ᩹:Z

.field public ᩺:Ljava/lang/String;


# direct methods
.method public constructor <init>(I)V
    .locals 3

    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    .line 63
    iput-object v0, p0, Ll/ۗ᩻᩻;->᩺:Ljava/lang/String;

    .line 64
    iput-object v0, p0, Ll/ۗ᩻᩻;->۬:Ljava/lang/String;

    const/4 v0, 0x0

    .line 65
    iput-boolean v0, p0, Ll/ۗ᩻᩻;->᩹:Z

    const/4 v1, 0x1

    .line 66
    iput-boolean v1, p0, Ll/ۗ᩻᩻;->ۛ:Z

    .line 67
    iput-boolean v1, p0, Ll/ۗ᩻᩻;->᩸:Z

    .line 68
    iput-boolean v1, p0, Ll/ۗ᩻᩻;->۫:Z

    .line 69
    iput-boolean v1, p0, Ll/ۗ᩻᩻;->ۨ:Z

    const-string v1, "10MB"

    .line 70
    iput-object v1, p0, Ll/ۗ᩻᩻;->ۙ:Ljava/lang/String;

    .line 71
    invoke-static {v1}, Ll/ۗ᩻᩻;->֫(Ljava/lang/String;)J

    move-result-wide v1

    iput-wide v1, p0, Ll/ۗ᩻᩻;->ۗ:J

    const/16 v1, 0xa

    .line 72
    iput v1, p0, Ll/ۗ᩻᩻;->ۤ:I

    .line 73
    iput-boolean v0, p0, Ll/ۗ᩻᩻;->۟:Z

    .line 74
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ۗ᩻᩻;->ܰ:Ljava/util/HashMap;

    .line 77
    iput p1, p0, Ll/ۗ᩻᩻;->᩶:I

    return-void
.end method

.method public constructor <init>(Lbin/mt/json/JSONObject;)V
    .locals 5

    .line 80
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    .line 63
    iput-object v0, p0, Ll/ۗ᩻᩻;->᩺:Ljava/lang/String;

    .line 64
    iput-object v0, p0, Ll/ۗ᩻᩻;->۬:Ljava/lang/String;

    const/4 v0, 0x0

    .line 65
    iput-boolean v0, p0, Ll/ۗ᩻᩻;->᩹:Z

    const/4 v1, 0x1

    .line 66
    iput-boolean v1, p0, Ll/ۗ᩻᩻;->ۛ:Z

    .line 67
    iput-boolean v1, p0, Ll/ۗ᩻᩻;->᩸:Z

    .line 68
    iput-boolean v1, p0, Ll/ۗ᩻᩻;->۫:Z

    .line 69
    iput-boolean v1, p0, Ll/ۗ᩻᩻;->ۨ:Z

    const-string v1, "10MB"

    .line 70
    iput-object v1, p0, Ll/ۗ᩻᩻;->ۙ:Ljava/lang/String;

    .line 71
    invoke-static {v1}, Ll/ۗ᩻᩻;->֫(Ljava/lang/String;)J

    move-result-wide v1

    iput-wide v1, p0, Ll/ۗ᩻᩻;->ۗ:J

    const/16 v1, 0xa

    .line 72
    iput v1, p0, Ll/ۗ᩻᩻;->ۤ:I

    .line 73
    iput-boolean v0, p0, Ll/ۗ᩻᩻;->۟:Z

    .line 74
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Ll/ۗ᩻᩻;->ܰ:Ljava/util/HashMap;

    const-string v1, "id"

    .line 81
    invoke-virtual {p1, v1}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Ll/ۗ᩻᩻;->᩶:I

    const-string v1, "rk"

    .line 82
    invoke-virtual {p1, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Ll/ۗ᩻᩻;->᩺:Ljava/lang/String;

    const-string v1, "ip"

    .line 83
    invoke-virtual {p1, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Ll/ۗ᩻᩻;->۬:Ljava/lang/String;

    const-string v1, "hs"

    .line 84
    invoke-virtual {p1, v1}, Lbin/mt/json/JSONObject;->contains(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 85
    invoke-virtual {p1, v1}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Ll/ۗ᩻᩻;->᩹:Z

    :cond_0
    const-string v1, "mt"

    .line 87
    invoke-virtual {p1, v1}, Lbin/mt/json/JSONObject;->contains(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 88
    invoke-virtual {p1, v1}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Ll/ۗ᩻᩻;->ۛ:Z

    :cond_1
    const-string v1, "fg"

    .line 90
    invoke-virtual {p1, v1}, Lbin/mt/json/JSONObject;->contains(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 91
    invoke-virtual {p1, v1}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Ll/ۗ᩻᩻;->᩸:Z

    :cond_2
    const-string v1, "lt"

    .line 93
    invoke-virtual {p1, v1}, Lbin/mt/json/JSONObject;->contains(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 94
    invoke-virtual {p1, v1}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Ll/ۗ᩻᩻;->۫:Z

    :cond_3
    const-string v1, "ow"

    .line 96
    invoke-virtual {p1, v1}, Lbin/mt/json/JSONObject;->contains(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 97
    invoke-virtual {p1, v1}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Ll/ۗ᩻᩻;->ۨ:Z

    :cond_4
    const-string v1, "il"

    .line 99
    invoke-virtual {p1, v1}, Lbin/mt/json/JSONObject;->contains(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 100
    invoke-virtual {p1, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Ll/ۗ᩻᩻;->ۙ:Ljava/lang/String;

    .line 101
    invoke-static {v1}, Ll/ۗ᩻᩻;->֫(Ljava/lang/String;)J

    move-result-wide v1

    iput-wide v1, p0, Ll/ۗ᩻᩻;->ۗ:J

    :cond_5
    const-string v1, "tl"

    .line 103
    invoke-virtual {p1, v1}, Lbin/mt/json/JSONObject;->contains(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 104
    invoke-virtual {p1, v1}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Ll/ۗ᩻᩻;->ۤ:I

    .line 106
    :cond_6
    invoke-virtual {p0}, Ll/ۗ᩻᩻;->ۜ()Z

    move-result v1

    if-eqz v1, :cond_7

    const-string v1, "sp"

    invoke-virtual {p1, v1}, Lbin/mt/json/JSONObject;->contains(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_7

    .line 107
    invoke-virtual {p1, v1}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Ll/ۗ᩻᩻;->۟:Z

    :cond_7
    const-string v1, "sm"

    .line 109
    invoke-virtual {p1, v1}, Lbin/mt/json/JSONObject;->contains(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_8

    .line 110
    invoke-virtual {p1, v1}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object p1

    .line 111
    invoke-virtual {p1}, Lbin/mt/json/JSONArray;->size()I

    move-result v1

    :goto_0
    if-ge v0, v1, :cond_8

    .line 112
    invoke-virtual {p1, v0}, Lbin/mt/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    add-int/lit8 v3, v0, 0x1

    .line 113
    invoke-virtual {p1, v3}, Lbin/mt/json/JSONArray;->getInt(I)I

    move-result v3

    .line 114
    iget-object v4, p0, Ll/ۗ᩻᩻;->ܰ:Ljava/util/HashMap;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v4, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v0, v0, 0x2

    goto :goto_0

    :cond_8
    return-void
.end method

.method public static ֫(Ljava/lang/String;)J
    .locals 4

    const-string v0, "KB"

    .line 558
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-wide/16 v0, 0x400

    goto :goto_0

    :cond_0
    const-wide/32 v0, 0x100000

    .line 560
    :goto_0
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, -0x2

    const/4 v3, 0x0

    invoke-virtual {p0, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    int-to-long v2, p0

    goto :goto_1

    :catch_0
    const-wide/16 v2, 0xa

    :goto_1
    mul-long v0, v0, v2

    return-wide v0
.end method

.method public static ֫(Landroid/widget/EditText;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 367
    invoke-virtual {p0}, Landroid/widget/TextView;->length()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    return-object p1
.end method

.method public static ֫(Landroid/widget/EditText;Landroid/widget/EditText;)V
    .locals 2

    .line 554
    new-instance v0, Ll/ۨۜܳ;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Ll/ۨۜܳ;-><init>(I)V

    invoke-static {p0, p1, v0}, Ll/ۗ᩻᩻;->֫(Landroid/widget/EditText;Landroid/widget/EditText;Ljava/util/function/Function;)V

    return-void
.end method

.method public static ֫(Landroid/widget/EditText;Landroid/widget/EditText;Ljava/util/function/Function;)V
    .locals 1

    .line 568
    invoke-virtual {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 569
    new-instance v0, Ll/ᩴ᩻᩻;

    invoke-direct {v0, p1, p2}, Ll/ᩴ᩻᩻;-><init>(Landroid/widget/EditText;Ljava/util/function/Function;)V

    invoke-virtual {p0, v0}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method

.method public static ֫(Landroid/widget/EditText;Ll/ۗܺ᩷;)V
    .locals 2

    .line 495
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_1

    .line 497
    instance-of v1, v0, Lcom/google/android/material/textfield/TextInputLayout;

    if-eqz v1, :cond_0

    .line 498
    check-cast v0, Lcom/google/android/material/textfield/TextInputLayout;

    goto :goto_1

    .line 500
    :cond_0
    invoke-interface {v0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 465
    :goto_1
    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, -0x1

    .line 466
    invoke-virtual {v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setEndIconMode(I)V

    const v1, 0x7f080221

    .line 467
    invoke-virtual {v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setEndIconDrawable(I)V

    .line 468
    new-instance v1, Ll/᩻۫᩻;

    invoke-direct {v1, p0, p1}, Ll/᩻۫᩻;-><init>(Landroid/widget/EditText;Ll/ۗܺ᩷;)V

    invoke-virtual {v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setEndIconOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public static ֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 598
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONObject;->contains(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p2}, Lbin/mt/json/JSONObject;->contains(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 599
    invoke-virtual {p0, p2}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    invoke-virtual {p0, p1, v0}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    .line 600
    invoke-virtual {p0, p2}, Lbin/mt/json/JSONObject;->remove(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    :cond_0
    return-void
.end method

.method public static ֫(Landroid/widget/EditText;)Z
    .locals 1

    .line 379
    invoke-virtual {p0}, Landroid/widget/TextView;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 381
    :try_start_0
    invoke-virtual {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const v0, 0x7f1206ce

    .line 383
    invoke-static {v0}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    .line 384
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    const/4 p0, 0x0

    return p0

    :cond_0
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static ֫(Landroid/widget/EditText;I)Z
    .locals 1

    .line 427
    invoke-virtual {p0}, Landroid/widget/TextView;->length()I

    move-result v0

    if-nez v0, :cond_0

    .line 428
    invoke-static {p0, p1}, Ll/ۗ᩻᩻;->ۧ(Landroid/widget/EditText;I)V

    const/4 p0, 0x0

    return p0

    :cond_0
    const/4 p0, 0x1

    return p0
.end method

.method public static ۧ(Landroid/widget/EditText;I)V
    .locals 2

    .line 435
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 495
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_1

    .line 497
    instance-of v1, v0, Lcom/google/android/material/textfield/TextInputLayout;

    if-eqz v1, :cond_0

    .line 498
    check-cast v0, Lcom/google/android/material/textfield/TextInputLayout;

    goto :goto_1

    .line 500
    :cond_0
    invoke-interface {v0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 437
    :goto_1
    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x1

    .line 438
    invoke-virtual {v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setErrorEnabled(Z)V

    .line 439
    invoke-static {p1}, Ll/ۙ᩸᩷;->ܽ(I)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    .line 440
    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p1

    instance-of p1, p1, Landroid/text/TextWatcher;

    if-nez p1, :cond_2

    .line 441
    new-instance p1, Ll/ۘ᩻᩻;

    invoke-direct {p1, v0}, Ll/ۘ᩻᩻;-><init>(Lcom/google/android/material/textfield/TextInputLayout;)V

    .line 459
    invoke-virtual {v0, p1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 460
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    :cond_2
    return-void
.end method

.method public static ۧ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 605
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONObject;->contains(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p2}, Lbin/mt/json/JSONObject;->contains(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 606
    invoke-virtual {p0, p2}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    .line 607
    invoke-virtual {p0, p2}, Lbin/mt/json/JSONObject;->remove(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    :cond_0
    return-void
.end method

.method public static ۧ(Landroid/widget/EditText;)Z
    .locals 4

    const v0, 0x7f1206cf

    .line 392
    invoke-static {p0, v0}, Ll/ۗ᩻᩻;->֫(Landroid/widget/EditText;I)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 395
    :cond_0
    invoke-virtual {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "://"

    .line 396
    invoke-virtual {v0, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_1

    .line 398
    invoke-virtual {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    add-int/lit8 v3, v2, 0x3

    invoke-interface {v0, v1, v3}, Landroid/text/Editable;->delete(II)Landroid/text/Editable;

    .line 399
    invoke-virtual {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_1
    const/16 v3, 0x2f

    .line 401
    invoke-virtual {v0, v3, v2}, Ljava/lang/String;->indexOf(II)I

    move-result v0

    if-lez v0, :cond_2

    const v2, 0x7f1202c1

    .line 403
    invoke-static {p0, v2}, Ll/ۗ᩻᩻;->ۧ(Landroid/widget/EditText;I)V

    .line 404
    invoke-virtual {p0}, Landroid/widget/TextView;->length()I

    move-result v2

    invoke-virtual {p0, v0, v2}, Landroid/widget/EditText;->setSelection(II)V

    return v1

    :cond_2
    const/4 p0, 0x1

    return p0
.end method

.method public static ᩷()I
    .locals 1

    .line 375
    invoke-static {}, Ll/۫᩻᩻;->ۧ()I

    move-result v0

    return v0
.end method


# virtual methods
.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 41
    invoke-virtual {p0}, Ll/ۗ᩻᩻;->clone()Ll/ۗ᩻᩻;

    move-result-object v0

    return-object v0
.end method

.method public final clone()Ll/ۗ᩻᩻;
    .locals 1

    .line 509
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۗ᩻᩻;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 511
    :catch_0
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    .line 521
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 523
    :cond_1
    check-cast p1, Ll/ۗ᩻᩻;

    .line 524
    iget v2, p0, Ll/ۗ᩻᩻;->᩶:I

    iget v3, p1, Ll/ۗ᩻᩻;->᩶:I

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Ll/ۗ᩻᩻;->᩺:Ljava/lang/String;

    iget-object v3, p1, Ll/ۗ᩻᩻;->᩺:Ljava/lang/String;

    .line 525
    invoke-static {v2, v3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ll/ۗ᩻᩻;->۬:Ljava/lang/String;

    iget-object v3, p1, Ll/ۗ᩻᩻;->۬:Ljava/lang/String;

    .line 526
    invoke-static {v2, v3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-boolean v2, p0, Ll/ۗ᩻᩻;->᩹:Z

    iget-boolean v3, p1, Ll/ۗ᩻᩻;->᩹:Z

    if-ne v2, v3, :cond_2

    iget-boolean v2, p0, Ll/ۗ᩻᩻;->ۛ:Z

    iget-boolean v3, p1, Ll/ۗ᩻᩻;->ۛ:Z

    if-ne v2, v3, :cond_2

    iget-boolean v2, p0, Ll/ۗ᩻᩻;->۟:Z

    iget-boolean v3, p1, Ll/ۗ᩻᩻;->۟:Z

    if-ne v2, v3, :cond_2

    iget-boolean v2, p0, Ll/ۗ᩻᩻;->᩸:Z

    iget-boolean v3, p1, Ll/ۗ᩻᩻;->᩸:Z

    if-ne v2, v3, :cond_2

    iget-boolean v2, p0, Ll/ۗ᩻᩻;->۫:Z

    iget-boolean v3, p1, Ll/ۗ᩻᩻;->۫:Z

    if-ne v2, v3, :cond_2

    iget-boolean v2, p0, Ll/ۗ᩻᩻;->ۨ:Z

    iget-boolean v3, p1, Ll/ۗ᩻᩻;->ۨ:Z

    if-ne v2, v3, :cond_2

    iget-wide v2, p0, Ll/ۗ᩻᩻;->ۗ:J

    iget-wide v4, p1, Ll/ۗ᩻᩻;->ۗ:J

    cmp-long v6, v2, v4

    if-nez v6, :cond_2

    iget v2, p0, Ll/ۗ᩻᩻;->ۤ:I

    iget p1, p1, Ll/ۗ᩻᩻;->ۤ:I

    if-ne v2, p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public abstract getIcon()Ll/᩶ۖܳ;
.end method

.method public abstract getName()Ljava/lang/String;
.end method

.method public hashCode()I
    .locals 5

    .line 540
    iget v0, p0, Ll/ۗ᩻᩻;->᩶:I

    const/16 v1, 0x1f

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Ll/ۗ᩻᩻;->᩺:Ljava/lang/String;

    .line 0
    invoke-static {v0, v1, v2}, Ll/᩶ᩴᩳ;->֫(IILjava/lang/String;)I

    move-result v0

    .line 541
    iget-object v2, p0, Ll/ۗ᩻᩻;->۬:Ljava/lang/String;

    .line 0
    invoke-static {v0, v1, v2}, Ll/᩶ᩴᩳ;->֫(IILjava/lang/String;)I

    move-result v0

    .line 542
    iget-boolean v1, p0, Ll/ۗ᩻᩻;->᩹:Z

    const/16 v2, 0x4d5

    if-eqz v1, :cond_0

    const/16 v1, 0x4cf

    goto :goto_0

    :cond_0
    const/16 v1, 0x4d5

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 543
    iget-boolean v1, p0, Ll/ۗ᩻᩻;->ۛ:Z

    if-eqz v1, :cond_1

    const/16 v1, 0x4cf

    goto :goto_1

    :cond_1
    const/16 v1, 0x4d5

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 544
    iget-boolean v1, p0, Ll/ۗ᩻᩻;->۟:Z

    if-eqz v1, :cond_2

    const/16 v1, 0x4cf

    goto :goto_2

    :cond_2
    const/16 v1, 0x4d5

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 545
    iget-boolean v1, p0, Ll/ۗ᩻᩻;->᩸:Z

    if-eqz v1, :cond_3

    const/16 v1, 0x4cf

    goto :goto_3

    :cond_3
    const/16 v1, 0x4d5

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 546
    iget-boolean v1, p0, Ll/ۗ᩻᩻;->۫:Z

    if-eqz v1, :cond_4

    const/16 v1, 0x4cf

    goto :goto_4

    :cond_4
    const/16 v1, 0x4d5

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 547
    iget-boolean v1, p0, Ll/ۗ᩻᩻;->ۨ:Z

    if-eqz v1, :cond_5

    const/16 v2, 0x4cf

    :cond_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 548
    iget-wide v1, p0, Ll/ۗ᩻᩻;->ۗ:J

    const/16 v3, 0x20

    ushr-long v3, v1, v3

    xor-long/2addr v1, v3

    long-to-int v2, v1

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 549
    iget v1, p0, Ll/ۗ᩻᩻;->ۤ:I

    add-int/2addr v0, v1

    return v0
.end method

.method public abstract ֫()Ljava/lang/String;
.end method

.method public abstract ֫(I)Ll/ۗۢ᩻;
.end method

.method public abstract ֫(Ll/ۗܺ᩷;)V
.end method

.method public ֫(Ll/ۗ᩻᩻;)V
    .locals 2

    .line 133
    iget-object v0, p1, Ll/ۗ᩻᩻;->᩺:Ljava/lang/String;

    iput-object v0, p0, Ll/ۗ᩻᩻;->᩺:Ljava/lang/String;

    .line 134
    iget-object v0, p1, Ll/ۗ᩻᩻;->۬:Ljava/lang/String;

    iput-object v0, p0, Ll/ۗ᩻᩻;->۬:Ljava/lang/String;

    .line 135
    iget-boolean v0, p1, Ll/ۗ᩻᩻;->᩹:Z

    iput-boolean v0, p0, Ll/ۗ᩻᩻;->᩹:Z

    .line 136
    iget-boolean v0, p1, Ll/ۗ᩻᩻;->ۛ:Z

    iput-boolean v0, p0, Ll/ۗ᩻᩻;->ۛ:Z

    .line 137
    iget-boolean v0, p1, Ll/ۗ᩻᩻;->۟:Z

    iput-boolean v0, p0, Ll/ۗ᩻᩻;->۟:Z

    .line 138
    iget-object v0, p0, Ll/ۗ᩻᩻;->ܰ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 139
    iget-object v1, p1, Ll/ۗ᩻᩻;->ܰ:Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 140
    invoke-virtual {p0, p1}, Ll/ۗ᩻᩻;->ۧ(Ll/ۗ᩻᩻;)V

    return-void
.end method

.method public ۜ()Z
    .locals 1

    .line 0
    instance-of v0, p0, Ll/֫ܺ᩻;

    return v0
.end method

.method public final ۧ(Ll/ۗ᩻᩻;)V
    .locals 2

    .line 144
    iget-boolean v0, p1, Ll/ۗ᩻᩻;->᩸:Z

    iput-boolean v0, p0, Ll/ۗ᩻᩻;->᩸:Z

    .line 145
    iget-boolean v0, p1, Ll/ۗ᩻᩻;->۫:Z

    iput-boolean v0, p0, Ll/ۗ᩻᩻;->۫:Z

    .line 146
    iget-boolean v0, p1, Ll/ۗ᩻᩻;->ۨ:Z

    iput-boolean v0, p0, Ll/ۗ᩻᩻;->ۨ:Z

    .line 147
    iget-object v0, p1, Ll/ۗ᩻᩻;->ۙ:Ljava/lang/String;

    iput-object v0, p0, Ll/ۗ᩻᩻;->ۙ:Ljava/lang/String;

    .line 148
    iget p1, p1, Ll/ۗ᩻᩻;->ۤ:I

    iput p1, p0, Ll/ۗ᩻᩻;->ۤ:I

    .line 149
    invoke-static {v0}, Ll/ۗ᩻᩻;->֫(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۗ᩻᩻;->ۗ:J

    return-void
.end method

.method public ܳ()Lbin/mt/json/JSONObject;
    .locals 5

    .line 329
    new-instance v0, Lbin/mt/json/JSONObject;

    invoke-direct {v0}, Lbin/mt/json/JSONObject;-><init>()V

    const-string v1, "id"

    .line 330
    iget v2, p0, Ll/ۗ᩻᩻;->᩶:I

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    const-string v1, "rk"

    .line 331
    iget-object v2, p0, Ll/ۗ᩻᩻;->᩺:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    const-string v1, "ip"

    .line 332
    iget-object v2, p0, Ll/ۗ᩻᩻;->۬:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    const-string v1, "hs"

    .line 333
    iget-boolean v2, p0, Ll/ۗ᩻᩻;->᩹:Z

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    const-string v1, "mt"

    .line 334
    iget-boolean v2, p0, Ll/ۗ᩻᩻;->ۛ:Z

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    const-string v1, "fg"

    .line 335
    iget-boolean v2, p0, Ll/ۗ᩻᩻;->᩸:Z

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    const-string v1, "lt"

    .line 336
    iget-boolean v2, p0, Ll/ۗ᩻᩻;->۫:Z

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    const-string v1, "ow"

    .line 337
    iget-boolean v2, p0, Ll/ۗ᩻᩻;->ۨ:Z

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    const-string v1, "il"

    .line 338
    iget-object v2, p0, Ll/ۗ᩻᩻;->ۙ:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    const-string v1, "tl"

    .line 339
    iget v2, p0, Ll/ۗ᩻᩻;->ۤ:I

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    .line 340
    invoke-virtual {p0}, Ll/ۗ᩻᩻;->ۜ()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "sp"

    .line 341
    iget-boolean v2, p0, Ll/ۗ᩻᩻;->۟:Z

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    .line 343
    :cond_0
    iget-object v1, p0, Ll/ۗ᩻᩻;->ܰ:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_2

    .line 344
    new-instance v2, Lbin/mt/json/JSONArray;

    invoke-direct {v2}, Lbin/mt/json/JSONArray;-><init>()V

    .line 345
    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 346
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v2, v4}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    .line 347
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {v2, v3}, Lbin/mt/json/JSONArray;->add(I)Lbin/mt/json/JSONArray;

    goto :goto_0

    :cond_1
    const-string v1, "sm"

    .line 349
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    :cond_2
    return-object v0
.end method

.method public abstract ܽ()Ljava/lang/String;
.end method

.method public abstract ܿ()Ljava/lang/String;
.end method

.method public abstract ᩳ()Ljava/lang/String;
.end method
