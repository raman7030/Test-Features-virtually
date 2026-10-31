.class public final Ll/ۧ᩸֫;
.super Ljava/lang/Object;
.source "Z754"

# interfaces
.implements Ll/ᩳ᩸֫;


# static fields
.field public static final ܿ:[Ljava/lang/String;


# instance fields
.field public final ֫:Ll/᩷۠֫;

.field public ۧ:Ljava/lang/String;

.field public final ܽ:Landroid/util/SparseArray;

.field public ᩳ:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const-string v0, "key"

    const-string v1, "metadata"

    const-string v2, "id"

    .line 751
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/ۧ᩸֫;->ܿ:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ll/᩷۠֫;)V
    .locals 0

    .line 773
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 774
    iput-object p1, p0, Ll/ۧ᩸֫;->֫:Ll/᩷۠֫;

    .line 775
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Ll/ۧ᩸֫;->ܽ:Landroid/util/SparseArray;

    return-void
.end method

.method private ֫(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 2

    .line 921
    iget-object v0, p0, Ll/ۧ᩸֫;->ۧ:Ljava/lang/String;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x1

    .line 921
    invoke-static {p1, v1, v0}, Ll/ۢ۠֫;->ۧ(Landroid/database/sqlite/SQLiteDatabase;ILjava/lang/String;)V

    .line 926
    iget-object v0, p0, Ll/ۧ᩸֫;->ᩳ:Ljava/lang/String;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "DROP TABLE IF EXISTS "

    .line 968
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 927
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "CREATE TABLE "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ۧ᩸֫;->ᩳ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    return-void
.end method

.method private ֫(Landroid/database/sqlite/SQLiteDatabase;Ll/֫᩸֫;)V
    .locals 4

    .line 937
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 938
    invoke-virtual {p2}, Ll/֫᩸֫;->֫()Ll/ۜ᩸֫;

    move-result-object v1

    new-instance v2, Ljava/io/DataOutputStream;

    invoke-direct {v2, v0}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    invoke-static {v1, v2}, Ll/ܿ᩸֫;->֫(Ll/ۜ᩸֫;Ljava/io/DataOutputStream;)V

    .line 939
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    .line 941
    new-instance v1, Landroid/content/ContentValues;

    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    .line 942
    iget v2, p2, Ll/֫᩸֫;->ۧ:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "id"

    invoke-virtual {v1, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v2, "key"

    .line 943
    iget-object p2, p2, Ll/֫᩸֫;->ܽ:Ljava/lang/String;

    invoke-virtual {v1, v2, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string p2, "metadata"

    .line 944
    invoke-virtual {v1, p2, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    .line 945
    iget-object p2, p0, Ll/ۧ᩸֫;->ᩳ:Ljava/lang/String;

    .line 155
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 945
    invoke-virtual {p1, p2, v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->replaceOrThrow(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    return-void
.end method


# virtual methods
.method public final delete()V
    .locals 9

    const-string v0, "ExoPlayerCacheIndex"

    .line 799
    iget-object v1, p0, Ll/ۧ᩸֫;->֫:Ll/᩷۠֫;

    iget-object v2, p0, Ll/ۧ᩸֫;->ۧ:Ljava/lang/String;

    .line 155
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 972
    :try_start_0
    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 952
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    .line 953
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->beginTransactionNonExclusive()V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_1

    .line 955
    :try_start_1
    sget v3, Ll/ۢ۠֫;->֫:I

    const-string v3, "ExoPlayerVersions"
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 132
    :try_start_2
    sget-object v4, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    const-string v4, "sqlite_master"

    const-string v5, "tbl_name = ?"

    .line 3550
    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v6

    .line 3551
    invoke-static {v1, v4, v5, v6}, Landroid/database/DatabaseUtils;->queryNumEntries(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)J

    move-result-wide v4

    const-wide/16 v6, 0x0

    cmp-long v8, v4, v6

    if-lez v8, :cond_0

    const-string v4, "feature = ? AND instance_uid = ?"

    const/4 v5, 0x1

    .line 181
    invoke-static {v5}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v5

    filled-new-array {v5, v2}, [Ljava/lang/String;

    move-result-object v2

    .line 135
    invoke-virtual {v1, v3, v4, v2}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_2
    .catch Landroid/database/SQLException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 968
    :cond_0
    :try_start_3
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "DROP TABLE IF EXISTS "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 958
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 960
    :try_start_4
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
    :try_end_4
    .catch Landroid/database/SQLException; {:try_start_4 .. :try_end_4} :catch_1

    return-void

    :catch_0
    move-exception v0

    .line 140
    :try_start_5
    new-instance v2, Ll/ۜ۠֫;

    .line 27
    invoke-direct {v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 140
    throw v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :catchall_0
    move-exception v0

    .line 960
    :try_start_6
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 961
    throw v0
    :try_end_6
    .catch Landroid/database/SQLException; {:try_start_6 .. :try_end_6} :catch_1

    :catch_1
    move-exception v0

    .line 963
    new-instance v1, Ll/ۜ۠֫;

    .line 27
    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 963
    throw v1
.end method

.method public final ֫(J)V
    .locals 0

    .line 780
    invoke-static {p1, p2}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ۧ᩸֫;->ۧ:Ljava/lang/String;

    const-string p2, "ExoPlayerCacheIndex"

    .line 0
    invoke-static {p2, p1}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 781
    iput-object p1, p0, Ll/ۧ᩸֫;->ᩳ:Ljava/lang/String;

    return-void
.end method

.method public final ֫(Ljava/util/HashMap;)V
    .locals 5

    .line 868
    iget-object p1, p0, Ll/ۧ᩸֫;->ܽ:Landroid/util/SparseArray;

    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 872
    :cond_0
    :try_start_0
    iget-object v0, p0, Ll/ۧ᩸֫;->֫:Ll/᩷۠֫;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 873
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->beginTransactionNonExclusive()V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v1, 0x0

    .line 875
    :goto_0
    :try_start_1
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    .line 876
    invoke-virtual {p1, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֫᩸֫;

    if-nez v2, :cond_1

    .line 878
    invoke-virtual {p1, v1}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v2

    .line 931
    iget-object v3, p0, Ll/ۧ᩸֫;->ᩳ:Ljava/lang/String;

    .line 155
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v4, "id = ?"

    .line 932
    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    .line 931
    invoke-virtual {v0, v3, v4, v2}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    goto :goto_1

    .line 880
    :cond_1
    invoke-direct {p0, v0, v2}, Ll/ۧ᩸֫;->֫(Landroid/database/sqlite/SQLiteDatabase;Ll/֫᩸֫;)V

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 883
    :cond_2
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V

    .line 884
    invoke-virtual {p1}, Landroid/util/SparseArray;->clear()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 886
    :try_start_2
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 887
    throw p1
    :try_end_2
    .catch Landroid/database/SQLException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    move-exception p1

    .line 889
    new-instance v0, Ll/ۜ۠֫;

    .line 27
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 889
    throw v0
.end method

.method public final ֫(Ljava/util/HashMap;Landroid/util/SparseArray;)V
    .locals 12

    .line 806
    iget-object v0, p0, Ll/ۧ᩸֫;->֫:Ll/᩷۠֫;

    iget-object v1, p0, Ll/ۧ᩸֫;->ܽ:Landroid/util/SparseArray;

    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Ll/᩺֡֫;->ۧ(Z)V

    .line 810
    :try_start_0
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    iget-object v4, p0, Ll/ۧ᩸֫;->ۧ:Ljava/lang/String;

    .line 155
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 809
    invoke-static {v1, v3, v4}, Ll/ۢ۠֫;->֫(Landroid/database/sqlite/SQLiteDatabase;ILjava/lang/String;)I

    move-result v1

    if-eq v1, v3, :cond_1

    .line 814
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    .line 815
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->beginTransactionNonExclusive()V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 817
    :try_start_1
    invoke-direct {p0, v1}, Ll/ۧ᩸֫;->֫(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 818
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 820
    :try_start_2
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    goto :goto_1

    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 821
    throw v0

    .line 909
    :cond_1
    :goto_1
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v4

    iget-object v5, p0, Ll/ۧ᩸֫;->ᩳ:Ljava/lang/String;

    .line 155
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 911
    sget-object v6, Ll/ۧ᩸֫;->ܿ:[Ljava/lang/String;

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    .line 910
    invoke-virtual/range {v4 .. v11}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_0

    .line 825
    :goto_2
    :try_start_3
    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 826
    invoke-interface {v0, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    .line 827
    invoke-interface {v0, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 155
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v5, 0x2

    .line 828
    invoke-interface {v0, v5}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v5

    .line 830
    new-instance v6, Ljava/io/ByteArrayInputStream;

    invoke-direct {v6, v5}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 831
    new-instance v5, Ljava/io/DataInputStream;

    invoke-direct {v5, v6}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    .line 832
    invoke-static {v5}, Ll/ܿ᩸֫;->֫(Ljava/io/DataInputStream;)Ll/ۜ᩸֫;

    move-result-object v5

    .line 834
    new-instance v6, Ll/֫᩸֫;

    invoke-direct {v6, v1, v4, v5}, Ll/֫᩸֫;-><init>(ILjava/lang/String;Ll/ۜ᩸֫;)V

    .line 835
    invoke-virtual {p1, v4, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 836
    invoke-virtual {p2, v1, v4}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_2

    .line 838
    :cond_2
    :try_start_4
    invoke-interface {v0}, Landroid/database/Cursor;->close()V
    :try_end_4
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_4 .. :try_end_4} :catch_0

    return-void

    :catchall_1
    move-exception v1

    if-eqz v0, :cond_3

    .line 824
    :try_start_5
    invoke-interface {v0}, Landroid/database/Cursor;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    goto :goto_3

    :catchall_2
    move-exception v0

    :try_start_6
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_3
    :goto_3
    throw v1
    :try_end_6
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_6 .. :try_end_6} :catch_0

    :catch_0
    move-exception v0

    .line 840
    invoke-virtual {p1}, Ljava/util/HashMap;->clear()V

    .line 841
    invoke-virtual {p2}, Landroid/util/SparseArray;->clear()V

    .line 842
    new-instance p1, Ll/ۜ۠֫;

    .line 27
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 842
    throw p1
.end method

.method public final ֫(Ll/֫᩸֫;)V
    .locals 2

    .line 895
    iget-object v0, p0, Ll/ۧ᩸֫;->ܽ:Landroid/util/SparseArray;

    iget v1, p1, Ll/֫᩸֫;->ۧ:I

    invoke-virtual {v0, v1, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-void
.end method

.method public final ֫(Ll/֫᩸֫;Z)V
    .locals 1

    .line 900
    iget p1, p1, Ll/֫᩸֫;->ۧ:I

    iget-object v0, p0, Ll/ۧ᩸֫;->ܽ:Landroid/util/SparseArray;

    if-eqz p2, :cond_0

    .line 901
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->delete(I)V

    return-void

    :cond_0
    const/4 p2, 0x0

    .line 903
    invoke-virtual {v0, p1, p2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-void
.end method

.method public final ֫()Z
    .locals 3

    .line 787
    :try_start_0
    iget-object v0, p0, Ll/ۧ᩸֫;->֫:Ll/᩷۠֫;

    .line 788
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    iget-object v1, p0, Ll/ۧ᩸֫;->ۧ:Ljava/lang/String;

    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x1

    .line 787
    invoke-static {v0, v2, v1}, Ll/ۢ۠֫;->֫(Landroid/database/sqlite/SQLiteDatabase;ILjava/lang/String;)I

    move-result v0
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v2

    :cond_0
    const/4 v0, 0x0

    return v0

    :catch_0
    move-exception v0

    .line 793
    new-instance v1, Ll/ۜ۠֫;

    .line 27
    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 793
    throw v1
.end method

.method public final ۧ(Ljava/util/HashMap;)V
    .locals 2

    .line 849
    :try_start_0
    iget-object v0, p0, Ll/ۧ᩸֫;->֫:Ll/᩷۠֫;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 850
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->beginTransactionNonExclusive()V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 852
    :try_start_1
    invoke-direct {p0, v0}, Ll/ۧ᩸֫;->֫(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 853
    invoke-virtual {p1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֫᩸֫;

    .line 854
    invoke-direct {p0, v0, v1}, Ll/ۧ᩸֫;->֫(Landroid/database/sqlite/SQLiteDatabase;Ll/֫᩸֫;)V

    goto :goto_0

    .line 856
    :cond_0
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V

    .line 857
    iget-object p1, p0, Ll/ۧ᩸֫;->ܽ:Landroid/util/SparseArray;

    invoke-virtual {p1}, Landroid/util/SparseArray;->clear()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 859
    :try_start_2
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 860
    throw p1
    :try_end_2
    .catch Landroid/database/SQLException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    move-exception p1

    .line 862
    new-instance v0, Ll/ۜ۠֫;

    .line 27
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 862
    throw v0
.end method
