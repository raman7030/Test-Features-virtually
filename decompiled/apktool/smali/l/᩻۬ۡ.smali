.class public final Ll/᩻۬ۡ;
.super Ljava/lang/Object;
.source "P1U8"

# interfaces
.implements Ll/ۡ۬ۡ;


# instance fields
.field public ֫:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/᩻۬ۡ;->֫:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public ֫(ILjava/lang/String;)Ljava/lang/String;
    .locals 7

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    const/4 v1, 0x1

    if-eq p1, v1, :cond_2

    const/4 v1, 0x2

    if-eq p1, v1, :cond_1

    const/4 p2, 0x4

    if-eq p1, p2, :cond_0

    move-object v2, v0

    goto :goto_1

    :cond_0
    const-string p1, "content://com.vivo.vms.IdProvider/IdentifierId/OAIDSTATUS"

    .line 44
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    goto :goto_0

    .line 41
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "content://com.vivo.vms.IdProvider/IdentifierId/AAID_"

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    goto :goto_0

    .line 38
    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "content://com.vivo.vms.IdProvider/IdentifierId/VAID_"

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    goto :goto_0

    :cond_3
    const-string p1, "content://com.vivo.vms.IdProvider/IdentifierId/OAID"

    .line 35
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    :goto_0
    move-object v2, p1

    .line 49
    :goto_1
    iget-object p1, p0, Ll/᩻۬ۡ;->֫:Ljava/lang/Object;

    check-cast p1, Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual/range {v1 .. v6}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    if-eqz p1, :cond_5

    .line 51
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    move-result p2

    if-eqz p2, :cond_4

    const-string p2, "value"

    .line 52
    invoke-interface {p1, p2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result p2

    invoke-interface {p1, p2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p2

    move-object v0, p2

    .line 54
    :cond_4
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    :cond_5
    return-object v0
.end method

.method public ֫(Ll/ۗۗۡ;)V
    .locals 1

    .line 15
    iget-object v0, p0, Ll/᩻۬ۡ;->֫:Ljava/lang/Object;

    check-cast v0, Ll/ܺ۬ۡ;

    invoke-virtual {p1, v0}, Ll/᩶ۗۡ;->ۧ(Ll/ۖ۬ۡ;)V

    return-void
.end method
