.class public abstract Ll/ۗۗ᩵;
.super Ll/ۙܶ᩵;
.source "SAY4"

# interfaces
.implements Ll/۟ܶ᩵;


# static fields
.field public static final ᩹:Ll/ۙۗ᩵;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 2
    new-instance v0, Ll/ۙۗ᩵;

    .line 37
    sget-object v1, Ll/۟ܶ᩵;->֡:Ll/ܰܶ᩵;

    .line 38
    sget-object v2, Ll/᩶ۗ᩵;->᩹:Ll/᩶ۗ᩵;

    .line 36
    invoke-direct {v0, v1, v2}, Ll/ۗܶ᩵;-><init>(Ll/ܿ᩸᩵;Ll/ܺ᩹᩵;)V

    .line 0
    sput-object v0, Ll/ۗۗ᩵;->᩹:Ll/ۙۗ᩵;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 32
    sget-object v0, Ll/۟ܶ᩵;->֡:Ll/ܰܶ᩵;

    invoke-direct {p0, v0}, Ll/ۙܶ᩵;-><init>(Ll/ܿ᩸᩵;)V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2

    .line 185
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    .line 185
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ll/ۧ۬᩵;->֫(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ᩴ᩸᩵;)Ll/ۧۛ᩵;
    .locals 1

    .line 159
    new-instance v0, Ll/ۧۛ᩵;

    invoke-direct {v0, p0, p1}, Ll/ۧۛ᩵;-><init>(Ll/ۗۗ᩵;Ll/ᩴ᩸᩵;)V

    return-object v0
.end method

.method public final ֫(Ll/ܿ᩸᩵;)Ll/ᩳ᩸᩵;
    .locals 0

    .line 31
    invoke-static {p0, p1}, Ll/᩺ܶ᩵;->֫(Ll/ۗۗ᩵;Ll/ܿ᩸᩵;)Ll/ᩳ᩸᩵;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ۨܶ᩵;)V
    .locals 0

    .line 166
    check-cast p1, Ll/ۧۛ᩵;

    .line 167
    invoke-virtual {p1}, Ll/ۧۛ᩵;->ܳ()V

    return-void
.end method

.method public abstract ֫(Ll/ܳ᩸᩵;Ljava/lang/Runnable;)V
.end method

.method public ۖ()Z
    .locals 1

    .line 0
    instance-of v0, p0, Ll/ۘ۫᩵;

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final ۧ(Ll/ܿ᩸᩵;)Ll/ܳ᩸᩵;
    .locals 0

    .line 31
    invoke-static {p0, p1}, Ll/᩺ܶ᩵;->ۧ(Ll/ۗۗ᩵;Ll/ܿ᩸᩵;)Ll/ܳ᩸᩵;

    move-result-object p1

    return-object p1
.end method
