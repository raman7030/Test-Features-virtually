.class public final Ll/ܰ۠ۘ;
.super Ljava/lang/Object;
.source "51RR"


# static fields
.field public static ۧ:Ll/ܰ۠ۘ;

.field public static ܽ:I


# instance fields
.field public ֫:Ljava/util/HashMap;


# virtual methods
.method public final ֫(Ll/᩺۠ۘ;)Ljava/lang/String;
    .locals 4

    const-string v0, ""

    .line 35
    sget v1, Ll/ܰ۠ۘ;->ܽ:I

    add-int/lit8 v1, v1, 0x1

    sput v1, Ll/ܰ۠ۘ;->ܽ:I

    .line 42
    :try_start_0
    iget-object v2, p0, Ll/ܰ۠ۘ;->֫:Ljava/util/HashMap;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 0
    :catchall_0
    invoke-static {v1, v0}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
