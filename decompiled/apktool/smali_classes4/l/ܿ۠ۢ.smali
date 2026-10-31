.class public final Ll/ܿ۠ۢ;
.super Ljava/lang/Object;
.source "LAXL"


# static fields
.field public static final ۜ:Ll/ܿ۠ۢ;

.field public static final ᩻:Ll/ܿ۠ۢ;


# instance fields
.field public ֫:Ljava/lang/String;

.field public ۧ:Ljava/lang/String;

.field public final ܳ:I

.field public ܽ:Z

.field public ܿ:Z

.field public ᩳ:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 36
    new-instance v0, Ll/ܿ۠ۢ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll/ܿ۠ۢ;-><init>(I)V

    sput-object v0, Ll/ܿ۠ۢ;->ۜ:Ll/ܿ۠ۢ;

    .line 37
    new-instance v0, Ll/ܿ۠ۢ;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ll/ܿ۠ۢ;-><init>(I)V

    sput-object v0, Ll/ܿ۠ۢ;->᩻:Ll/ܿ۠ۢ;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    iput p1, p0, Ll/ܿ۠ۢ;->ܳ:I

    return-void
.end method

.method public static ֫(Ljava/lang/Exception;)Ll/ܿ۠ۢ;
    .locals 5

    .line 89
    new-instance v0, Ll/ܿ۠ۢ;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ll/ܿ۠ۢ;-><init>(I)V

    .line 91
    instance-of v2, p0, Ljava/util/concurrent/ExecutionException;

    if-eqz v2, :cond_0

    .line 92
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-nez v2, :cond_1

    :cond_0
    move-object v2, p0

    .line 97
    :cond_1
    instance-of v3, v2, Ll/ܳۨۡ;

    if-eqz v3, :cond_2

    .line 98
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Ll/ܿ۠ۢ;->ۧ:Ljava/lang/String;

    .line 99
    iput-boolean v1, v0, Ll/ܿ۠ۢ;->ܿ:Z

    return-object v0

    .line 103
    :cond_2
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object v3

    .line 104
    :goto_0
    instance-of v4, v2, Ljava/io/FileNotFoundException;

    if-eqz v4, :cond_4

    const-string v4, "EISDIR"

    invoke-virtual {v3, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_4

    const-string v4, "File not found: "

    .line 105
    invoke-virtual {v4, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    :cond_4
    const/16 v4, 0x1f4

    .line 107
    invoke-static {v4, v3}, Ll/ۜۚۜ;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, Ll/ܿ۠ۢ;->ۧ:Ljava/lang/String;

    .line 109
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_7

    .line 111
    invoke-static {}, Ll/᩺᩵ۡ;->ܺ()Z

    move-result v4

    if-nez v4, :cond_6

    const v4, 0x7f120757

    invoke-static {v4}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_5

    const v4, 0x7f120756

    invoke-static {v4}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_6

    .line 112
    :cond_5
    iput-boolean v1, v0, Ll/ܿ۠ۢ;->ܽ:Z

    return-object v0

    .line 115
    :cond_6
    invoke-static {}, Ll/᩺᩵ۡ;->ۘ()Z

    move-result v4

    if-nez v4, :cond_7

    const v4, 0x7f120415

    invoke-static {v4}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_7

    .line 116
    iput-boolean v1, v0, Ll/ܿ۠ۢ;->ᩳ:Z

    return-object v0

    .line 120
    :cond_7
    instance-of v1, v2, Ll/֫ۛۡ;

    if-nez v1, :cond_9

    instance-of v1, v2, Ll/᩵ۤۡ;

    if-nez v1, :cond_9

    .line 121
    instance-of v1, v2, Ll/۫ᩴܿ;

    if-eqz v1, :cond_8

    check-cast v2, Ll/۫ᩴܿ;

    .line 122
    invoke-static {v2}, Ll/᩵ۨܳ;->֫(Ll/۫ᩴܿ;)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Ll/ܿ۠ۢ;->֫:Ljava/lang/String;

    return-object v0

    .line 124
    :cond_8
    invoke-static {p0}, Ll/ᩴۗܿ;->֫(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Ll/ܿ۠ۢ;->֫:Ljava/lang/String;

    :cond_9
    return-object v0
.end method

.method public static ֫(Ljava/lang/String;)Ll/ܿ۠ۢ;
    .locals 2

    .line 80
    new-instance v0, Ll/ܿ۠ۢ;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ll/ܿ۠ۢ;-><init>(I)V

    .line 81
    iput-object p0, v0, Ll/ܿ۠ۢ;->ۧ:Ljava/lang/String;

    return-object v0
.end method

.method public static ֫(Ll/ܿ۠ۢ;Ll/ۗܺ᩷;)V
    .locals 2

    .line 185
    iget-object p0, p0, Ll/ܿ۠ۢ;->֫:Ljava/lang/String;

    const v0, 0x7f120309

    invoke-static {v0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    .line 323
    invoke-static {p1, p0, v0, v1, v1}, Ll/ܶۖᩳ;->֫(Ll/ۗܺ᩷;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static ܳ()Ll/ܿ۠ۢ;
    .locals 1

    .line 72
    sget-object v0, Ll/ܿ۠ۢ;->ۜ:Ll/ܿ۠ۢ;

    return-object v0
.end method

.method public static ܿ()Ll/ܿ۠ۢ;
    .locals 1

    .line 76
    sget-object v0, Ll/ܿ۠ۢ;->᩻:Ll/ܿ۠ۢ;

    return-object v0
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 143
    iget-object v0, p0, Ll/ܿ۠ۢ;->ۧ:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫(Ll/ۗܺ᩷;)V
    .locals 4

    .line 148
    invoke-virtual {p0}, Ll/ܿ۠ۢ;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 149
    iget-object v0, p0, Ll/ܿ۠ۢ;->ۧ:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 152
    :cond_0
    iget-boolean v0, p0, Ll/ܿ۠ۢ;->ܿ:Z

    if-eqz v0, :cond_1

    .line 153
    iget-object p1, p0, Ll/ܿ۠ۢ;->ۧ:Ljava/lang/String;

    invoke-static {p1}, Ll/᩸ۚۢ;->֫(Ljava/lang/CharSequence;)Ll/᩸ۚۢ;

    return-void

    .line 156
    :cond_1
    iget-object v0, p0, Ll/ܿ۠ۢ;->֫:Ljava/lang/String;

    if-eqz v0, :cond_2

    const-string v1, "AndroidDataFileUnreadableException///"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 157
    iget-object v0, p0, Ll/ܿ۠ۢ;->֫:Ljava/lang/String;

    invoke-static {p1, v0}, Ll/᩵ۨܳ;->֫(Ll/ۗܺ᩷;Ljava/lang/String;)V

    return-void

    .line 160
    :cond_2
    invoke-virtual {p1}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v0

    const v1, 0x7f12030c

    .line 161
    invoke-virtual {v0, v1}, Ll/᩵ۚۢ;->ۧ(I)V

    iget-object v1, p0, Ll/ܿ۠ۢ;->ۧ:Ljava/lang/String;

    .line 162
    invoke-virtual {v0, v1}, Ll/᩵ۚۢ;->֫(Ljava/lang/CharSequence;)V

    const v1, 0x7f120189

    const/4 v2, 0x0

    .line 163
    invoke-virtual {v0, v1, v2}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const v1, 0x7f120309

    .line 164
    invoke-virtual {v0, v1, v2}, Ll/᩵ۚۢ;->ܽ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 165
    invoke-virtual {v0}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object v0

    .line 166
    invoke-static {v0}, Ll/ۡܶۡ;->ܽ(Ll/֡ۚۢ;)V

    .line 167
    iget-boolean v1, p0, Ll/ܿ۠ۢ;->ܽ:Z

    if-eqz v1, :cond_3

    .line 168
    invoke-virtual {v0}, Ll/֡ۚۢ;->ᩳ()Landroid/widget/Button;

    move-result-object v1

    const v2, 0x7f120afa

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    .line 169
    sget-object v1, Ll/۟ۚۡ;->ᩳ:Ll/ۚۡ֫;

    new-instance v2, Ll/֫۠ۢ;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v3}, Ll/֫۠ۢ;-><init>(Ll/᩻ۡ֫;I)V

    invoke-virtual {v1, v0, v2}, Ll/֡ۡ֫;->֫(Ll/᩻ۡ֫;Ll/֨ۡ֫;)V

    .line 174
    invoke-virtual {v0}, Ll/֡ۚۢ;->ᩳ()Landroid/widget/Button;

    move-result-object v0

    new-instance v1, Ll/ۧ۠ۢ;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Ll/ۧ۠ۢ;-><init>(Ll/ۗܺ᩷;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void

    .line 179
    :cond_3
    iget-boolean v1, p0, Ll/ܿ۠ۢ;->ᩳ:Z

    if-eqz v1, :cond_4

    .line 180
    invoke-virtual {v0}, Ll/֡ۚۢ;->ᩳ()Landroid/widget/Button;

    move-result-object v1

    const v2, 0x7f120b19

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    .line 181
    invoke-virtual {v0}, Ll/֡ۚۢ;->ᩳ()Landroid/widget/Button;

    move-result-object v0

    new-instance v1, Ll/ܽ۠ۢ;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Ll/ܽ۠ۢ;-><init>(Ll/ۗܺ᩷;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void

    .line 184
    :cond_4
    iget-object v1, p0, Ll/ܿ۠ۢ;->֫:Ljava/lang/String;

    if-eqz v1, :cond_5

    .line 185
    invoke-virtual {v0}, Ll/֡ۚۢ;->ᩳ()Landroid/widget/Button;

    move-result-object v0

    new-instance v1, Ll/ᩳ۠ۢ;

    const/4 v2, 0x0

    invoke-direct {v1, v2, p0, p1}, Ll/ᩳ۠ۢ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void

    .line 188
    :cond_5
    invoke-virtual {v0}, Ll/֡ۚۢ;->ᩳ()Landroid/widget/Button;

    move-result-object p1

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void

    .line 190
    :cond_6
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "Not a failure result"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۧ()Z
    .locals 2

    .line 139
    iget v0, p0, Ll/ܿ۠ۢ;->ܳ:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ()Z
    .locals 2

    .line 135
    iget v0, p0, Ll/ܿ۠ۢ;->ܳ:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩳ()Z
    .locals 1

    .line 131
    iget v0, p0, Ll/ܿ۠ۢ;->ܳ:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
