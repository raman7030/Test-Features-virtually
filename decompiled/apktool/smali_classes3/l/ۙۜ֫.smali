.class public abstract Ll/ۙۜ֫;
.super Ll/ۨ᩺ۧ;
.source "23U2"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field public ܳ:Z

.field public final ܽ:I

.field public ܿ:Ll/ۡ᩻֫;

.field public ᩳ:Ll/ܽ᩷֫;

.field public final ᩻:Ll/ۚۜ֫;


# direct methods
.method public constructor <init>(Ll/ۚۜ֫;)V
    .locals 1

    .line 138
    invoke-direct {p0}, Ll/ۨ᩺ۧ;-><init>()V

    const/4 v0, 0x0

    .line 104
    iput-object v0, p0, Ll/ۙۜ֫;->ᩳ:Ll/ܽ᩷֫;

    .line 105
    iput-object v0, p0, Ll/ۙۜ֫;->ܿ:Ll/ۡ᩻֫;

    .line 139
    iput-object p1, p0, Ll/ۙۜ֫;->᩻:Ll/ۚۜ֫;

    const/4 p1, 0x1

    .line 140
    iput p1, p0, Ll/ۙۜ֫;->ܽ:I

    return-void
.end method


# virtual methods
.method public final ֫(Ll/֡ܰۧ;I)Ljava/lang/Object;
    .locals 8

    .line 161
    iget-object v0, p0, Ll/ۙۜ֫;->ᩳ:Ll/ܽ᩷֫;

    iget-object v1, p0, Ll/ۙۜ֫;->᩻:Ll/ۚۜ֫;

    if-nez v0, :cond_0

    .line 162
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 598
    new-instance v0, Ll/ᩳܳ֫;

    invoke-direct {v0, v1}, Ll/ᩳܳ֫;-><init>(Ll/ۚۜ֫;)V

    .line 162
    iput-object v0, p0, Ll/ۙۜ֫;->ᩳ:Ll/ܽ᩷֫;

    :cond_0
    int-to-long v2, p2

    .line 168
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    .line 287
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "android:switcher:"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ":"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 169
    invoke-virtual {v1, v4}, Ll/ۚۜ֫;->ۧ(Ljava/lang/String;)Ll/ۡ᩻֫;

    move-result-object v1

    const/4 v4, 0x1

    if-eqz v1, :cond_1

    .line 172
    iget-object p1, p0, Ll/ۙۜ֫;->ᩳ:Ll/ܽ᩷֫;

    invoke-virtual {p1, v1}, Ll/ܽ᩷֫;->֫(Ll/ۡ᩻֫;)V

    goto :goto_0

    .line 174
    :cond_1
    invoke-virtual {p0, p2}, Ll/ۙۜ֫;->ۧ(I)Ll/ۡ᩻֫;

    move-result-object v1

    .line 176
    iget-object p2, p0, Ll/ۙۜ֫;->ᩳ:Ll/ܽ᩷֫;

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v6

    .line 177
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    .line 287
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, v6, v1, p1, v4}, Ll/ܽ᩷֫;->֫(ILl/ۡ᩻֫;Ljava/lang/String;I)V

    .line 179
    :goto_0
    iget-object p1, p0, Ll/ۙۜ֫;->ܿ:Ll/ۡ᩻֫;

    if-eq v1, p1, :cond_3

    const/4 p1, 0x0

    .line 180
    invoke-virtual {v1, p1}, Ll/ۡ᩻֫;->setMenuVisibility(Z)V

    .line 181
    iget p2, p0, Ll/ۙۜ֫;->ܽ:I

    if-ne p2, v4, :cond_2

    .line 182
    iget-object p1, p0, Ll/ۙۜ֫;->ᩳ:Ll/ܽ᩷֫;

    sget-object p2, Ll/ܰۢ֫;->۬:Ll/ܰۢ֫;

    invoke-virtual {p1, v1, p2}, Ll/ܽ᩷֫;->֫(Ll/ۡ᩻֫;Ll/ܰۢ֫;)Ll/ܽ᩷֫;

    return-object v1

    .line 184
    :cond_2
    invoke-virtual {v1, p1}, Ll/ۡ᩻֫;->setUserVisibleHint(Z)V

    :cond_3
    return-object v1
.end method

.method public final ֫()V
    .locals 4

    .line 240
    iget-object v0, p0, Ll/ۙۜ֫;->ᩳ:Ll/ܽ᩷֫;

    if-eqz v0, :cond_2

    .line 246
    iget-boolean v1, p0, Ll/ۙۜ֫;->ܳ:Z

    if-nez v1, :cond_1

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 248
    :try_start_0
    iput-boolean v1, p0, Ll/ۙۜ֫;->ܳ:Z

    .line 249
    check-cast v0, Ll/ᩳܳ֫;

    .line 755
    iget-boolean v3, v0, Ll/ܽ᩷֫;->֫:Z

    if-nez v3, :cond_0

    .line 759
    iput-boolean v2, v0, Ll/ܽ᩷֫;->ۧ:Z

    .line 323
    iget-object v3, v0, Ll/ᩳܳ֫;->֨:Ll/ۚۜ֫;

    invoke-virtual {v3, v0, v1}, Ll/ۚۜ֫;->֫(Ll/ᩳܳ֫;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 251
    iput-boolean v2, p0, Ll/ۙۜ֫;->ܳ:Z

    goto :goto_0

    .line 756
    :cond_0
    :try_start_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "This transaction is already being added to the back stack"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    .line 251
    iput-boolean v2, p0, Ll/ۙۜ֫;->ܳ:Z

    .line 252
    throw v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 254
    iput-object v0, p0, Ll/ۙۜ֫;->ᩳ:Ll/ܽ᩷֫;

    :cond_2
    return-void
.end method

.method public final ֫(Ljava/lang/Object;)V
    .locals 6

    .line 211
    check-cast p1, Ll/ۡ᩻֫;

    .line 212
    iget-object v0, p0, Ll/ۙۜ֫;->ܿ:Ll/ۡ᩻֫;

    if-eq p1, v0, :cond_5

    .line 213
    iget-object v1, p0, Ll/ۙۜ֫;->᩻:Ll/ۚۜ֫;

    iget v2, p0, Ll/ۙۜ֫;->ܽ:I

    const/4 v3, 0x1

    if-eqz v0, :cond_2

    const/4 v4, 0x0

    .line 214
    invoke-virtual {v0, v4}, Ll/ۡ᩻֫;->setMenuVisibility(Z)V

    if-ne v2, v3, :cond_1

    .line 216
    iget-object v0, p0, Ll/ۙۜ֫;->ᩳ:Ll/ܽ᩷֫;

    if-nez v0, :cond_0

    .line 217
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 598
    new-instance v0, Ll/ᩳܳ֫;

    invoke-direct {v0, v1}, Ll/ᩳܳ֫;-><init>(Ll/ۚۜ֫;)V

    .line 217
    iput-object v0, p0, Ll/ۙۜ֫;->ᩳ:Ll/ܽ᩷֫;

    .line 219
    :cond_0
    iget-object v0, p0, Ll/ۙۜ֫;->ᩳ:Ll/ܽ᩷֫;

    iget-object v4, p0, Ll/ۙۜ֫;->ܿ:Ll/ۡ᩻֫;

    sget-object v5, Ll/ܰۢ֫;->۬:Ll/ܰۢ֫;

    invoke-virtual {v0, v4, v5}, Ll/ܽ᩷֫;->֫(Ll/ۡ᩻֫;Ll/ܰۢ֫;)Ll/ܽ᩷֫;

    goto :goto_0

    .line 221
    :cond_1
    iget-object v0, p0, Ll/ۙۜ֫;->ܿ:Ll/ۡ᩻֫;

    invoke-virtual {v0, v4}, Ll/ۡ᩻֫;->setUserVisibleHint(Z)V

    .line 224
    :cond_2
    :goto_0
    invoke-virtual {p1, v3}, Ll/ۡ᩻֫;->setMenuVisibility(Z)V

    if-ne v2, v3, :cond_4

    .line 226
    iget-object v0, p0, Ll/ۙۜ֫;->ᩳ:Ll/ܽ᩷֫;

    if-nez v0, :cond_3

    .line 227
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 598
    new-instance v0, Ll/ᩳܳ֫;

    invoke-direct {v0, v1}, Ll/ᩳܳ֫;-><init>(Ll/ۚۜ֫;)V

    .line 227
    iput-object v0, p0, Ll/ۙۜ֫;->ᩳ:Ll/ܽ᩷֫;

    .line 229
    :cond_3
    iget-object v0, p0, Ll/ۙۜ֫;->ᩳ:Ll/ܽ᩷֫;

    sget-object v1, Ll/ܰۢ֫;->ۗ:Ll/ܰۢ֫;

    invoke-virtual {v0, p1, v1}, Ll/ܽ᩷֫;->֫(Ll/ۡ᩻֫;Ll/ܰۢ֫;)Ll/ܽ᩷֫;

    goto :goto_1

    .line 231
    :cond_4
    invoke-virtual {p1, v3}, Ll/ۡ᩻֫;->setUserVisibleHint(Z)V

    .line 234
    :goto_1
    iput-object p1, p0, Ll/ۙۜ֫;->ܿ:Ll/ۡ᩻֫;

    :cond_5
    return-void
.end method

.method public final ֫(Ll/֡ܰۧ;)V
    .locals 2

    .line 151
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    return-void

    .line 152
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ViewPager with adapter "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " requires a view id"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/֡ܰۧ;ILjava/lang/Object;)V
    .locals 0

    .line 195
    check-cast p3, Ll/ۡ᩻֫;

    .line 197
    iget-object p1, p0, Ll/ۙۜ֫;->ᩳ:Ll/ܽ᩷֫;

    if-nez p1, :cond_0

    .line 198
    iget-object p1, p0, Ll/ۙۜ֫;->᩻:Ll/ۚۜ֫;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 598
    new-instance p2, Ll/ᩳܳ֫;

    invoke-direct {p2, p1}, Ll/ᩳܳ֫;-><init>(Ll/ۚۜ֫;)V

    .line 198
    iput-object p2, p0, Ll/ۙۜ֫;->ᩳ:Ll/ܽ᩷֫;

    .line 202
    :cond_0
    iget-object p1, p0, Ll/ۙۜ֫;->ᩳ:Ll/ܽ᩷֫;

    invoke-virtual {p1, p3}, Ll/ܽ᩷֫;->ۧ(Ll/ۡ᩻֫;)Ll/ܽ᩷֫;

    .line 203
    iget-object p1, p0, Ll/ۙۜ֫;->ܿ:Ll/ۡ᩻֫;

    invoke-virtual {p3, p1}, Ll/ۡ᩻֫;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    .line 204
    iput-object p1, p0, Ll/ۙۜ֫;->ܿ:Ll/ۡ᩻֫;

    :cond_1
    return-void
.end method

.method public final ֫(Landroid/view/View;Ljava/lang/Object;)Z
    .locals 0

    .line 260
    check-cast p2, Ll/ۡ᩻֫;

    invoke-virtual {p2}, Ll/ۡ᩻֫;->getView()Landroid/view/View;

    move-result-object p2

    if-ne p2, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public abstract ۧ(I)Ll/ۡ᩻֫;
.end method
