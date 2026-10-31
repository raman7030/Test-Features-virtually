.class public abstract Ll/᩸۫᩵;
.super Ll/ۗۗ᩵;
.source "UAXR"

# interfaces
.implements Ll/ܿ۬᩵;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ll/ۗۗ᩵;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/᩸۫᩵;-><init>()V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2

    .line 69
    sget v0, Ll/ۢ۬᩵;->֫:I

    .line 57
    sget-object v0, Ll/ۘۛ᩵;->֫:Ll/᩸۫᩵;

    if-ne p0, v0, :cond_0

    const-string v0, "Dispatchers.Main"

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    .line 72
    :try_start_0
    invoke-virtual {v0}, Ll/᩸۫᩵;->ۘ()Ll/᩸۫᩵;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-object v0, v1

    :goto_0
    if-ne p0, v0, :cond_1

    const-string v0, "Dispatchers.Main.immediate"

    goto :goto_1

    :cond_1
    move-object v0, v1

    :goto_1
    if-nez v0, :cond_2

    .line 54
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ll/ۧ۬᩵;->֫(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_2
    return-object v0
.end method

.method public abstract ۘ()Ll/᩸۫᩵;
.end method
