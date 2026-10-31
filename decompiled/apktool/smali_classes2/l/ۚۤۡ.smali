.class public final Ll/ۚۤۡ;
.super Ljava/lang/Object;
.source "97B5"

# interfaces
.implements Landroid/content/SharedPreferences$Editor;


# instance fields
.field public ֫:Z

.field public final ۧ:Ljava/util/HashMap;

.field public final synthetic ܽ:Ll/֨ۤۡ;


# direct methods
.method public constructor <init>(Ll/֨ۤۡ;)V
    .locals 0

    .line 218
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۚۤۡ;->ܽ:Ll/֨ۤۡ;

    .line 219
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Ll/ۚۤۡ;->ۧ:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final apply()V
    .locals 0

    .line 315
    invoke-virtual {p0}, Ll/ۚۤۡ;->commit()Z

    return-void
.end method

.method public final clear()Landroid/content/SharedPreferences$Editor;
    .locals 1

    const/4 v0, 0x1

    .line 304
    iput-boolean v0, p0, Ll/ۚۤۡ;->֫:Z

    .line 305
    iget-object v0, p0, Ll/ۚۤۡ;->ۧ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    return-object p0
.end method

.method public final commit()Z
    .locals 3

    .line 324
    iget-boolean v0, p0, Ll/ۚۤۡ;->֫:Z

    new-instance v1, Ljava/util/HashMap;

    iget-object v2, p0, Ll/ۚۤۡ;->ۧ:Ljava/util/HashMap;

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iget-object v2, p0, Ll/ۚۤۡ;->ܽ:Ll/֨ۤۡ;

    invoke-static {v2, v0, v1}, Ll/֨ۤۡ;->֫(Ll/֨ۤۡ;ZLjava/util/HashMap;)V

    const/4 v0, 0x1

    return v0
.end method

.method public final putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
    .locals 1

    .line 284
    iget-object v0, p0, Ll/ۚۤۡ;->ۧ:Ljava/util/HashMap;

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public final putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;
    .locals 1

    .line 274
    iget-object v0, p0, Ll/ۚۤۡ;->ۧ:Ljava/util/HashMap;

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public final putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
    .locals 1

    .line 254
    iget-object v0, p0, Ll/ۚۤۡ;->ۧ:Ljava/util/HashMap;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public final putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
    .locals 1

    .line 264
    iget-object v0, p0, Ll/ۚۤۡ;->ۧ:Ljava/util/HashMap;

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public final putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    .locals 1

    if-nez p2, :cond_0

    .line 229
    invoke-virtual {p0, p1}, Ll/ۚۤۡ;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    return-object p0

    .line 231
    :cond_0
    iget-object v0, p0, Ll/ۚۤۡ;->ۧ:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public final putStringSet(Ljava/lang/String;Ljava/util/Set;)Landroid/content/SharedPreferences$Editor;
    .locals 1

    if-nez p2, :cond_0

    .line 242
    invoke-virtual {p0, p1}, Ll/ۚۤۡ;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    return-object p0

    .line 244
    :cond_0
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0, p2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iget-object p2, p0, Ll/ۚۤۡ;->ۧ:Ljava/util/HashMap;

    invoke-virtual {p2, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public final remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    .locals 2

    .line 294
    iget-object v0, p0, Ll/ۚۤۡ;->ۧ:Ljava/util/HashMap;

    invoke-static {}, Ll/֨ۤۡ;->֫()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method
