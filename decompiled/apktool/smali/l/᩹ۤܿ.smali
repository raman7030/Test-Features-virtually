.class public final Ll/᩹ۤܿ;
.super Ll/ܶ۬ܿ;
.source "G668"


# instance fields
.field public final synthetic ۜ:[B

.field public final synthetic ᩻:Ll/ۗۤܿ;


# direct methods
.method public constructor <init>(Ll/ۗۤܿ;Ll/ۗܺ᩷;[B)V
    .locals 0

    .line 79
    iput-object p1, p0, Ll/᩹ۤܿ;->᩻:Ll/ۗۤܿ;

    iput-object p3, p0, Ll/᩹ۤܿ;->ۜ:[B

    invoke-direct {p0, p2}, Ll/ܶ۬ܿ;-><init>(Ll/ۗܺ᩷;)V

    return-void
.end method


# virtual methods
.method public final ܽ()Z
    .locals 15

    .line 82
    invoke-static {}, Ll/᩺᩵ۡ;->ۘ()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const v0, 0x7f120415

    .line 83
    invoke-static {v0}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return v1

    .line 86
    :cond_0
    invoke-virtual {p0, v1}, Ll/ܶ۬ܿ;->֫(I)Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x1

    .line 87
    invoke-virtual {p0, v2}, Ll/ܶ۬ܿ;->֫(I)Landroid/widget/EditText;

    move-result-object v3

    invoke-virtual {v3}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x2

    .line 88
    invoke-virtual {p0, v9}, Ll/ܶ۬ܿ;->֫(I)Landroid/widget/EditText;

    move-result-object v3

    invoke-virtual {v3}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v10

    .line 89
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 90
    invoke-virtual {p0, v1}, Ll/ܶ۬ܿ;->֫(I)Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    return v1

    .line 93
    :cond_1
    invoke-virtual {v8}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 94
    invoke-virtual {p0, v2}, Ll/ܶ۬ܿ;->֫(I)Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    return v1

    .line 97
    :cond_2
    invoke-virtual {v10}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 98
    invoke-virtual {p0, v9}, Ll/ܶ۬ܿ;->֫(I)Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    return v1

    .line 101
    :cond_3
    iget-object v11, p0, Ll/᩹ۤܿ;->ۜ:[B

    array-length v2, v11

    const/4 v3, 0x4

    if-ge v2, v3, :cond_4

    const v0, 0x7f1204e2

    .line 102
    invoke-static {v0}, Ll/᩸ۚۢ;->ۧ(I)V

    return v1

    .line 105
    :cond_4
    new-instance v4, Ll/۬۬ܿ;

    iget-object v2, p0, Ll/᩹ۤܿ;->᩻:Ll/ۗۤܿ;

    invoke-static {v2}, Ll/ۗۤܿ;->֫(Ll/ۗۤܿ;)Ll/ۗܺ᩷;

    move-result-object v3

    const v5, 0x7f1207a7

    invoke-direct {v4, v3, v5}, Ll/۬۬ܿ;-><init>(Ll/ۗܺ᩷;I)V

    invoke-virtual {v4}, Ll/۬۬ܿ;->ܳ()V

    .line 106
    invoke-static {v2}, Ll/ۗۤܿ;->֫(Ll/ۗۤܿ;)Ll/ۗܺ᩷;

    move-result-object v12

    new-instance v13, Ll/᩸ۤܿ;

    move-object v2, v13

    move-object v3, p0

    move-object v5, v0

    move-object v6, v8

    move-object v7, v10

    invoke-direct/range {v2 .. v7}, Ll/᩸ۤܿ;-><init>(Ll/᩹ۤܿ;Ll/۬۬ܿ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1033
    array-length v2, v11

    const v3, 0x19000

    if-gt v2, v3, :cond_6

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_6

    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_6

    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_5

    goto :goto_0

    .line 1037
    :cond_5
    new-instance v9, Ljava/lang/Thread;

    new-instance v14, Ll/֡֨ۡ;

    move-object v2, v14

    move-object v3, v11

    move-object v4, v0

    move-object v5, v8

    move-object v6, v10

    move-object v7, v12

    move-object v8, v13

    invoke-direct/range {v2 .. v8}, Ll/֡֨ۡ;-><init>([BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ۗܺ᩷;Ll/ۢ۠ۡ;)V

    invoke-direct {v9, v14}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 1046
    invoke-virtual {v9}, Ljava/lang/Thread;->start()V

    return v1

    .line 1034
    :cond_6
    :goto_0
    new-instance v0, Ll/᩻ᩴۡ;

    invoke-direct {v0, v9}, Ll/᩻ᩴۡ;-><init>(I)V

    invoke-interface {v13, v0}, Ll/ۢ۠ۡ;->֫(Ll/᩻ᩴۡ;)V

    return v1
.end method
