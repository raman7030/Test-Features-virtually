.class public final Ll/ۨᩳ᩷;
.super Ljava/lang/Object;
.source "K2RM"


# static fields
.field public static final ֫:Ljava/util/HashMap;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 8
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Ll/ۨᩳ᩷;->֫:Ljava/util/HashMap;

    return-void
.end method

.method public static ֫(Ljava/lang/String;Ll/ۤᩳ᩷;)V
    .locals 1

    .line 11
    sget-object v0, Ll/ۨᩳ᩷;->֫:Ljava/util/HashMap;

    invoke-static {v0, p0, p1}, Ll/ۘۛ;->ᩳۚ᩺(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static ֫(Ljava/lang/String;)Z
    .locals 1

    .line 20
    sget-object v0, Ll/ۨᩳ᩷;->֫:Ljava/util/HashMap;

    invoke-static {v0, p0}, Ll/ۘۛ;->ۢۖ᩷(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static ۧ(Ljava/lang/String;)Ll/ۤᩳ᩷;
    .locals 1

    .line 16
    sget-object v0, Ll/ۨᩳ᩷;->֫:Ljava/util/HashMap;

    invoke-static {v0, p0}, Ll/֨۟;->ᩳۨ᩺(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ۤᩳ᩷;

    return-object p0
.end method

.method public static ܽ(Ljava/lang/String;)V
    .locals 1

    .line 25
    sget-object v0, Ll/ۨᩳ᩷;->֫:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
