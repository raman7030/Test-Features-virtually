.class public final synthetic Ll/ۡ᩵ܿ;
.super Ljava/lang/Object;
.source "A186"

# interfaces
.implements Ll/۠ۚ֫;
.implements Ll/۬֡ܿ;
.implements Ll/ᩴܺܳ;
.implements Ll/ᩳ᩷ܳ;
.implements Ll/ܶۖ;
.implements Ll/۟֫ۢ;
.implements Ll/ۡ۠ۡ;


# instance fields
.field public final synthetic ᩸:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۡ᩵ܿ;->᩸:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic cancel()V
    .locals 0

    return-void
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 1

    .line 2
    iget-object v0, p0, Ll/ۡ᩵ܿ;->᩸:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/ۨ᩵֫;

    .line 6
    check-cast p1, Ll/֡᩵֫;

    .line 1271
    invoke-interface {p1, v0}, Ll/֡᩵֫;->֫(Ll/ۨ᩵֫;)V

    return-void
.end method

.method public onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 0

    .line 0
    iget-object p1, p0, Ll/ۡ᩵ܿ;->᩸:Ljava/lang/Object;

    check-cast p1, Ll/۫۠ܳ;

    invoke-static {p1}, Ll/۫۠ܳ;->֫(Ll/۫۠ܳ;)V

    const/4 p1, 0x1

    return p1
.end method

.method public ֫(I)Ljava/io/InputStream;
    .locals 1

    .line 2
    iget-object p1, p0, Ll/ۡ᩵ܿ;->᩸:Ljava/lang/Object;

    .line 4
    check-cast p1, [B

    .line 1143
    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-direct {v0, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    return-object v0
.end method

.method public ֫(Ll/ܰ֫ۢ;)V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/ۡ᩵ܿ;->᩸:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public ֫(Ll/ܶ᩵ܿ;)V
    .locals 1

    .line 2
    iget-object v0, p0, Ll/ۡ᩵ܿ;->᩸:Ljava/lang/Object;

    .line 4
    check-cast v0, Ljava/lang/String;

    .line 979
    invoke-virtual {p1, v0}, Ll/ܶ᩵ܿ;->ۡ(Ljava/lang/String;)V

    return-void
.end method

.method public ۧ(I)Ll/ܽ᩷ܳ;
    .locals 9

    .line 2
    iget-object v0, p0, Ll/ۡ᩵ܿ;->᩸:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/ܶ᩵ܿ;

    .line 751
    new-instance v8, Ll/᩹֨᩻;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v2

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    move-object v1, v8

    move v3, p1

    invoke-direct/range {v1 .. v7}, Ll/᩹֨᩻;-><init>(Ljava/lang/String;IJJ)V

    return-object v8
.end method

.method public ۧ(Ll/ܶ᩵ܿ;)V
    .locals 2

    .line 2
    iget-object v0, p0, Ll/ۡ᩵ܿ;->᩸:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/ܽۢܳ;

    .line 114
    new-instance v1, Ll/ۗۤܿ;

    invoke-virtual {v0}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v0

    invoke-direct {v1, v0, p1}, Ll/ۗۤܿ;-><init>(Ll/ۗܺ᩷;Ll/ܶ᩵ܿ;)V

    invoke-virtual {v1}, Ll/ۗۤܿ;->֫()V

    return-void
.end method
