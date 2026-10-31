.class public final Ll/۫۫ۧ;
.super Ljava/lang/Object;
.source "5AMS"

# interfaces
.implements Ll/ᩴۤ᩵;


# instance fields
.field public final synthetic ᩸:Ll/ᩴۤ᩵;

.field public final synthetic ᩹:Ll/ۛ۫ۧ;


# direct methods
.method public constructor <init>(Ll/ᩴۤ᩵;Ll/ۛ۫ۧ;)V
    .locals 0

    .line 106
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 0
    iput-object p1, p0, Ll/۫۫ۧ;->᩸:Ll/ᩴۤ᩵;

    iput-object p2, p0, Ll/۫۫ۧ;->᩹:Ll/ۛ۫ۧ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/᩵ۤ᩵;Ll/ۨܶ᩵;)Ljava/lang/Object;
    .locals 2

    .line 114
    new-instance v0, Ll/۬۫ۧ;

    iget-object v1, p0, Ll/۫۫ۧ;->᩹:Ll/ۛ۫ۧ;

    invoke-direct {v0, p1, v1}, Ll/۬۫ۧ;-><init>(Ll/᩵ۤ᩵;Ll/ۛ۫ۧ;)V

    iget-object p1, p0, Ll/۫۫ۧ;->᩸:Ll/ᩴۤ᩵;

    invoke-interface {p1, v0, p2}, Ll/ᩴۤ᩵;->֫(Ll/᩵ۤ᩵;Ll/ۨܶ᩵;)Ljava/lang/Object;

    move-result-object p1

    .line 57
    sget-object p2, Ll/ۜ᩸᩵;->᩶:Ll/ۜ᩸᩵;

    if-ne p1, p2, :cond_0

    return-object p1

    .line 55
    :cond_0
    sget-object p1, Ll/۠۠᩵;->֫:Ll/۠۠᩵;

    return-object p1
.end method
