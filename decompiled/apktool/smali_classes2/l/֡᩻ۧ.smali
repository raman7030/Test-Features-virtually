.class public final Ll/֡᩻ۧ;
.super Ljava/lang/Object;
.source "Q8Q4"

# interfaces
.implements Ll/ܳ֡֫;


# instance fields
.field public final ֫:Ll/ᩳ֡֫;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1154
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1155
    new-instance v0, Ll/᩵᩻ۧ;

    .line 1222
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1155
    iput-object v0, p0, Ll/֡᩻ۧ;->֫:Ll/ᩳ֡֫;

    return-void
.end method


# virtual methods
.method public final ֫(Landroid/content/Context;Ll/᩷ᩴ֫;Ll/֨᩻ۧ;Ll/ۜ᩻ۧ;)Ll/᩻֡֫;
    .locals 5

    :try_start_0
    const-string v0, "androidx.media3.effect.SingleInputVideoGraph$Factory"

    .line 1172
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const/4 v1, 0x1

    new-array v2, v1, [Ljava/lang/Class;

    .line 1173
    const-class v3, Ll/ᩳ֡֫;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 1176
    invoke-virtual {v0, v2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    iget-object v2, p0, Ll/֡᩻ۧ;->֫:Ll/ᩳ֡֫;

    new-array v1, v1, [Ljava/lang/Object;

    aput-object v2, v1, v4

    .line 1177
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܳ֡֫;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1184
    invoke-interface {v0, p1, p2, p3, p4}, Ll/ܳ֡֫;->֫(Landroid/content/Context;Ll/᩷ᩴ֫;Ll/֨᩻ۧ;Ll/ۜ᩻ۧ;)Ll/᩻֡֫;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    .line 1182
    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method
