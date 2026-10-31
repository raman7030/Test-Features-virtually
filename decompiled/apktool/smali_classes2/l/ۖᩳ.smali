.class public final Ll/ۖᩳ;
.super Ll/ۢᩳ;
.source "YB7L"


# instance fields
.field public final synthetic ֫:Ll/᩵ᩳ;

.field public final synthetic ۧ:Ll/᩸ᩳ;

.field public final synthetic ܽ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/᩵ᩳ;Ljava/lang/String;Ll/᩸ᩳ;)V
    .locals 0

    .line 232
    iput-object p1, p0, Ll/ۖᩳ;->֫:Ll/᩵ᩳ;

    iput-object p2, p0, Ll/ۖᩳ;->ܽ:Ljava/lang/String;

    iput-object p3, p0, Ll/ۖᩳ;->ۧ:Ll/᩸ᩳ;

    invoke-direct {p0}, Ll/ۢᩳ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    .line 253
    iget-object v0, p0, Ll/ۖᩳ;->֫:Ll/᩵ᩳ;

    iget-object v1, p0, Ll/ۖᩳ;->ܽ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ll/᩵ᩳ;->֫(Ljava/lang/String;)V

    return-void
.end method

.method public final ֫(Ljava/lang/Object;)V
    .locals 5

    .line 235
    iget-object v0, p0, Ll/ۖᩳ;->֫:Ll/᩵ᩳ;

    iget-object v1, v0, Ll/᩵ᩳ;->ܽ:Ljava/util/HashMap;

    iget-object v2, p0, Ll/ۖᩳ;->ܽ:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    .line 236
    iget-object v3, p0, Ll/ۖᩳ;->ۧ:Ll/᩸ᩳ;

    if-eqz v1, :cond_0

    .line 242
    iget-object v4, v0, Ll/᩵ᩳ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 244
    :try_start_0
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1, v3, p1}, Ll/᩵ᩳ;->֫(ILl/᩸ᩳ;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 246
    iget-object v0, v0, Ll/᩵ᩳ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 247
    throw p1

    .line 237
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Attempting to launch an unregistered ActivityResultLauncher with contract "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " and input "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ". You must ensure the ActivityResultLauncher is registered before calling launch()."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
