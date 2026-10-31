.class public abstract Ll/ۨܶᩴ;
.super Ljava/lang/Object;
.source "N673"


# static fields
.field public static final a:Ll/ۤܶᩴ;

.field public static final b:Ll/ۤܶᩴ;

.field public static final c:Ll/ۤܶᩴ;

.field public static final d:Ll/ۤܶᩴ;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 47
    new-instance v0, Ll/ۤܶᩴ;

    const-class v1, Ljava/lang/Object;

    const/4 v2, 0x0

    const-string v3, "OVERFLOW"

    invoke-direct {v0, v2, v3, v1}, Ll/ۤܶᩴ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    sput-object v0, Ll/ۨܶᩴ;->a:Ll/ۤܶᩴ;

    .line 58
    new-instance v0, Ll/ۤܶᩴ;

    const-class v1, Ll/᩷۠ᩴ;

    const-string v3, "ENTRY_CREATE"

    invoke-direct {v0, v2, v3, v1}, Ll/ۤܶᩴ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    sput-object v0, Ll/ۨܶᩴ;->b:Ll/ۤܶᩴ;

    .line 69
    new-instance v0, Ll/ۤܶᩴ;

    const-class v1, Ll/᩷۠ᩴ;

    const-string v3, "ENTRY_DELETE"

    invoke-direct {v0, v2, v3, v1}, Ll/ۤܶᩴ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    sput-object v0, Ll/ۨܶᩴ;->c:Ll/ۤܶᩴ;

    .line 80
    new-instance v0, Ll/ۤܶᩴ;

    const-class v1, Ll/᩷۠ᩴ;

    const-string v3, "ENTRY_MODIFY"

    invoke-direct {v0, v2, v3, v1}, Ll/ۤܶᩴ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    sput-object v0, Ll/ۨܶᩴ;->d:Ll/ۤܶᩴ;

    return-void
.end method
