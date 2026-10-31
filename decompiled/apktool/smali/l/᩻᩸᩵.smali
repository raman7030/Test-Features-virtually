.class public final Ll/᩻᩸᩵;
.super Ljava/lang/Object;
.source "VAZ3"

# interfaces
.implements Ll/ܳ᩸᩵;
.implements Ljava/io/Serializable;


# static fields
.field public static final serialVersionUID:J

.field public static final ᩸:Ll/᩻᩸᩵;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 2
    new-instance v0, Ll/᩻᩸᩵;

    .line 96
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 0
    sput-object v0, Ll/᩻᩸᩵;->᩸:Ll/᩻᩸᩵;

    return-void
.end method

.method private final readResolve()Ljava/lang/Object;
    .locals 1

    .line 99
    sget-object v0, Ll/᩻᩸᩵;->᩸:Ll/᩻᩸᩵;

    return-object v0
.end method


# virtual methods
.method public final hashCode()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "EmptyCoroutineContext"

    return-object v0
.end method

.method public final ֫(Ljava/lang/Object;Ll/᩵᩹᩵;)Ljava/lang/Object;
    .locals 0

    return-object p1
.end method

.method public final ֫(Ll/ܳ᩸᩵;)Ll/ܳ᩸᩵;
    .locals 1

    const-string v0, "context"

    .line 0
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final ֫(Ll/ܿ᩸᩵;)Ll/ᩳ᩸᩵;
    .locals 1

    const-string v0, "key"

    .line 0
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final ۧ(Ll/ܿ᩸᩵;)Ll/ܳ᩸᩵;
    .locals 1

    const-string v0, "key"

    .line 0
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
