.class public Ll/ܽܰܽ;
.super Ll/ۗܺ᩷;
.source "G16V"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;
.implements Landroid/widget/AdapterView$OnItemLongClickListener;


# static fields
.field public static final synthetic ܳۧ:I


# instance fields
.field public ܿۧ:Ljava/util/List;

.field public ᩳۧ:Ll/ۧܰܽ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 35
    invoke-direct {p0}, Ll/ۗܺ᩷;-><init>()V

    .line 36
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Ll/ܽܰܽ;->ܿۧ:Ljava/util/List;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܽܰܽ;)Ll/ۧܰܽ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܽܰܽ;->ᩳۧ:Ll/ۧܰܽ;

    return-object p0
.end method

.method public static ֫(Ll/ܽܰܽ;ILandroid/view/MenuItem;)V
    .locals 6

    .line 147
    iget-object v0, p0, Ll/ܽܰܽ;->ܿۧ:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 148
    invoke-interface {p2}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x7f12035a

    const/4 v2, 0x0

    const/4 v3, 0x3

    if-ne v0, v1, :cond_0

    .line 150
    :try_start_0
    invoke-static {p1}, Ll/ܺ᩺ܽ;->ܽ(Ljava/lang/String;)Ll/ۡ᩺ܽ;

    move-result-object p2

    .line 151
    invoke-virtual {p2}, Ll/ۡ᩺ܽ;->ܽ()Lorg/json/JSONObject;

    move-result-object p2

    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p2

    .line 152
    new-instance v0, Ll/ۤۜܽ;

    invoke-direct {v0}, Ll/ۤۜܽ;-><init>()V

    const v1, -0x7d8d8dee

    .line 153
    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeInt(I)V

    .line 154
    invoke-virtual {v0, p1}, Ll/ۤۜܽ;->ܿ(Ljava/lang/String;)V

    .line 155
    invoke-virtual {v0, p2}, Ll/ۤۜܽ;->ܿ(Ljava/lang/String;)V

    .line 156
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result p1

    invoke-virtual {v0, p1}, Ll/ۤۜܽ;->writeInt(I)V

    .line 157
    invoke-virtual {v0}, Ll/ۤۜܽ;->ۜ()[B

    move-result-object p1

    invoke-static {p1, v3}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/CharSequence;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 546
    invoke-virtual {p0, p1, v2}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void

    .line 161
    :cond_0
    invoke-interface {p2}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const/4 v1, 0x6

    const v4, 0x7f1205f9

    const/4 v5, 0x1

    if-ne v0, v4, :cond_1

    .line 162
    new-instance p2, Ll/۟᩺ܽ;

    invoke-direct {p2, p0, p0, p1}, Ll/۟᩺ܽ;-><init>(Ll/ܽܰܽ;Ll/ܽܰܽ;Ljava/lang/String;)V

    .line 181
    invoke-virtual {p2, v4}, Ll/۬ۗܿ;->ۡ(I)V

    .line 182
    invoke-virtual {p2, p1}, Ll/۬ۗܿ;->֫(Ljava/lang/CharSequence;)V

    .line 183
    invoke-virtual {p2}, Ll/۬ۗܿ;->֫()V

    .line 184
    invoke-virtual {p2, v1}, Ll/۬ۗܿ;->ᩳ(I)V

    .line 185
    invoke-virtual {p2}, Ll/۬ۗܿ;->᩵()V

    .line 205
    invoke-virtual {p2, v5}, Ll/۬ۗܿ;->ۧ(Z)V

    return-void

    .line 187
    :cond_1
    invoke-interface {p2}, Landroid/view/MenuItem;->getItemId()I

    move-result p2

    const v0, 0x7f1205ca

    if-ne p2, v0, :cond_2

    .line 188
    sget p2, Ll/֡ۚۢ;->᩹:I

    .line 186
    new-instance p2, Ll/᩵ۚۢ;

    invoke-direct {p2, p0}, Ll/᩵ۚۢ;-><init>(Landroid/content/Context;)V

    .line 189
    invoke-virtual {p2, v0}, Ll/᩵ۚۢ;->ۧ(I)V

    new-array v0, v5, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const v1, 0x7f120870

    .line 190
    invoke-virtual {p0, v1, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ll/᩵ۚۢ;->֫(Ljava/lang/CharSequence;)V

    new-instance v0, Ll/᩺᩺ܽ;

    invoke-direct {v0, p0, p1}, Ll/᩺᩺ܽ;-><init>(Ll/ܽܰܽ;Ljava/lang/String;)V

    const p0, 0x7f12070a

    .line 191
    invoke-virtual {p2, p0, v0}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const p0, 0x7f12015e

    .line 195
    invoke-virtual {p2, p0, v2}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 196
    invoke-virtual {p2}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void

    .line 199
    :cond_2
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v0, 0x2

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 200
    :goto_0
    invoke-static {p2}, Ll/ܺ᩺ܽ;->ۧ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 0
    invoke-static {p1}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    add-int/lit8 v0, v3, 0x1

    .line 201
    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    move v3, v0

    goto :goto_0

    .line 203
    :cond_3
    new-instance v0, Ll/֫ܰܽ;

    invoke-direct {v0, p0, p0, p1}, Ll/֫ܰܽ;-><init>(Ll/ܽܰܽ;Ll/ܽܰܽ;Ljava/lang/String;)V

    const p0, 0x7f1205c2

    .line 224
    invoke-virtual {v0, p0}, Ll/۬ۗܿ;->ۡ(I)V

    .line 225
    invoke-virtual {v0, p2}, Ll/۬ۗܿ;->֫(Ljava/lang/CharSequence;)V

    .line 226
    invoke-virtual {v0}, Ll/۬ۗܿ;->֫()V

    .line 227
    invoke-virtual {v0, v1}, Ll/۬ۗܿ;->ᩳ(I)V

    .line 228
    invoke-virtual {v0}, Ll/۬ۗܿ;->᩵()V

    .line 205
    invoke-virtual {v0, v5}, Ll/۬ۗܿ;->ۧ(Z)V

    return-void
.end method

.method public static synthetic ֫(Ll/ܽܰܽ;Ljava/lang/String;)V
    .locals 0

    .line 192
    invoke-static {p1}, Ll/ܺ᩺ܽ;->֫(Ljava/lang/String;)V

    .line 193
    invoke-static {}, Ll/ܺ᩺ܽ;->ۧ()Ljava/util/ArrayList;

    move-result-object p1

    iput-object p1, p0, Ll/ܽܰܽ;->ܿۧ:Ljava/util/List;

    .line 194
    iget-object p0, p0, Ll/ܽܰܽ;->ᩳۧ:Ll/ۧܰܽ;

    invoke-virtual {p0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܽܰܽ;Ljava/util/ArrayList;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ܽܰܽ;->ܿۧ:Ljava/util/List;

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ܽܰܽ;)Ljava/util/List;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܽܰܽ;->ܿۧ:Ljava/util/List;

    return-object p0
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 46
    invoke-super {p0, p1}, Ll/ۗܺ᩷;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f1208d9

    .line 47
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    const p1, 0x7f0d0034

    .line 48
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    const p1, 0x7f0a063a

    .line 49
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Ll/ۢᩴ;

    iput-object p1, p0, Ll/ۗܺ᩷;->ۛ֫:Ll/ۢᩴ;

    const p1, 0x102000a

    .line 50
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ListView;

    .line 51
    iget-object v0, p0, Ll/ۗܺ᩷;->ۛ֫:Ll/ۢᩴ;

    invoke-virtual {p0, v0}, Ll/ۗܺ᩷;->֫(Ll/ۢᩴ;)V

    .line 52
    invoke-virtual {p0}, Ll/ۗܺ᩷;->ۗ()V

    .line 53
    iget-object v0, p0, Ll/ۗܺ᩷;->ۛ֫:Ll/ۢᩴ;

    new-instance v1, Ll/ۗᩴۡ;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Ll/ۗᩴۡ;-><init>(Landroid/view/KeyEvent$Callback;I)V

    invoke-virtual {v0, v1}, Ll/ۢᩴ;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 54
    invoke-static {}, Ll/ܺ᩺ܽ;->ۧ()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Ll/ܽܰܽ;->ܿۧ:Ljava/util/List;

    .line 55
    new-instance v0, Ll/ۧܰܽ;

    invoke-direct {v0, p0}, Ll/ۧܰܽ;-><init>(Ll/ܽܰܽ;)V

    iput-object v0, p0, Ll/ܽܰܽ;->ᩳۧ:Ll/ۧܰܽ;

    invoke-virtual {p1, v0}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 56
    invoke-virtual {p1, p0}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 57
    invoke-virtual {p1, p0}, Landroid/widget/AdapterView;->setOnItemLongClickListener(Landroid/widget/AdapterView$OnItemLongClickListener;)V

    return-void
.end method

.method public final onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    .line 69
    invoke-virtual {p0}, Ll/֨ܿ;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    const v1, 0x7f0f001c

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    .line 133
    iget-object p1, p0, Ll/ܽܰܽ;->ܿۧ:Ljava/util/List;

    invoke-interface {p1, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 134
    new-instance p2, Landroid/content/Intent;

    const-class p3, Ll/ۛ᩺ܽ;

    invoke-direct {p2, p0, p3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string p3, "schemeName"

    .line 135
    invoke-virtual {p2, p3, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 136
    invoke-virtual {p0, p2}, Ll/ۗܺ᩷;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public final onItemLongClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)Z
    .locals 1

    .line 141
    new-instance p1, Ll/᩸ۖ;

    const/4 p4, 0x0

    .line 68
    invoke-direct {p1, p0, p2, p4}, Ll/᩸ۖ;-><init>(Landroid/content/Context;Landroid/view/View;I)V

    .line 142
    invoke-virtual {p1}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object p5

    const v0, 0x7f1205f9

    invoke-interface {p5, p4, v0, p4, v0}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    .line 143
    invoke-virtual {p1}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object p5

    const v0, 0x7f1205c2

    invoke-interface {p5, p4, v0, p4, v0}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    .line 144
    invoke-virtual {p1}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object p5

    const v0, 0x7f1205ca

    invoke-interface {p5, p4, v0, p4, v0}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    .line 145
    invoke-virtual {p1}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object p5

    const v0, 0x7f12035a

    invoke-interface {p5, p4, v0, p4, v0}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    .line 146
    new-instance p4, Ll/ۨ᩺ܽ;

    invoke-direct {p4, p0, p3}, Ll/ۨ᩺ܽ;-><init>(Ll/ܽܰܽ;I)V

    invoke-virtual {p1, p4}, Ll/᩸ۖ;->֫(Ll/ܶۖ;)V

    .line 233
    invoke-static {p2, p1}, Ll/ᩳ᩹ۡ;->֫(Landroid/view/View;Ll/᩸ۖ;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 4

    .line 75
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    const v0, 0x7f0a011f

    const/4 v1, 0x1

    if-ne p1, v0, :cond_0

    .line 77
    new-instance p1, Ll/ܰ᩺ܽ;

    invoke-direct {p1, p0, p0}, Ll/ܰ᩺ܽ;-><init>(Ll/ܽܰܽ;Ll/ܽܰܽ;)V

    const v0, 0x7f1204a7

    .line 101
    invoke-virtual {p1, v0}, Ll/۬ۗܿ;->ۡ(I)V

    invoke-virtual {p1}, Ll/۬ۗܿ;->֫()V

    const/4 v0, 0x6

    .line 102
    invoke-virtual {p1, v0}, Ll/۬ۗܿ;->ᩳ(I)V

    .line 205
    invoke-virtual {p1, v1}, Ll/۬ۗܿ;->ۧ(Z)V

    return v1

    :cond_0
    const v0, 0x7f0a0289

    if-ne p1, v0, :cond_2

    .line 108
    :try_start_0
    invoke-static {}, Ll/ۙ᩸᩷;->ܳ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x3

    .line 109
    invoke-static {p1, v0}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object p1

    invoke-static {p1}, Ll/۬ۜܽ;->ۧ([B)Ll/۬ۜܽ;

    move-result-object p1

    const v0, -0x7d8d8dee

    .line 110
    invoke-static {p1, v0}, Ll/᩹ۜܽ;->֫(Ll/᩶ۜܽ;I)V

    .line 111
    invoke-virtual {p1}, Ll/۬ۜܽ;->᩹()Ljava/lang/String;

    move-result-object v0

    .line 112
    invoke-virtual {p1}, Ll/۬ۜܽ;->᩹()Ljava/lang/String;

    move-result-object v2

    .line 113
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v3

    invoke-virtual {p1}, Ll/۬ۜܽ;->readInt()I

    move-result p1

    if-ne v3, p1, :cond_1

    .line 116
    invoke-static {v0}, Ll/ܺ᩺ܽ;->ᩳ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 117
    new-instance v0, Ll/ۡ᩺ܽ;

    invoke-direct {v0, p1}, Ll/ۡ᩺ܽ;-><init>(Ljava/lang/String;)V

    .line 118
    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ll/ۡ᩺ܽ;->֫(Lorg/json/JSONObject;)V

    .line 119
    invoke-static {v0}, Ll/ܺ᩺ܽ;->֫(Ll/ۡ᩺ܽ;)V

    .line 120
    invoke-static {}, Ll/ܺ᩺ܽ;->ۧ()Ljava/util/ArrayList;

    move-result-object p1

    iput-object p1, p0, Ll/ܽܰܽ;->ܿۧ:Ljava/util/List;

    .line 121
    iget-object p1, p0, Ll/ܽܰܽ;->ᩳۧ:Ll/ۧܰܽ;

    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    const p1, 0x7f120487

    .line 122
    invoke-static {p1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return v1

    .line 114
    :cond_1
    new-instance p1, Ljava/lang/Exception;

    invoke-direct {p1}, Ljava/lang/Exception;-><init>()V

    throw p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const p1, 0x7f120474

    .line 124
    invoke-static {p1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return v1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public final onResume()V
    .locals 1

    .line 62
    invoke-super {p0}, Ll/ۗܺ᩷;->onResume()V

    .line 63
    invoke-static {}, Ll/ܺ᩺ܽ;->ۧ()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Ll/ܽܰܽ;->ܿۧ:Ljava/util/List;

    .line 64
    iget-object v0, p0, Ll/ܽܰܽ;->ᩳۧ:Ll/ۧܰܽ;

    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method public final ۚ()Ljava/lang/String;
    .locals 1

    const-string v0, "SchemeManagerActivity"

    return-object v0
.end method
